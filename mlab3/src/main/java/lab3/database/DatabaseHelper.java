package lab3.database;

import lab3.entity.Shot;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import javax.persistence.Query;
import java.util.List;

public class DatabaseHelper {
    private final SessionFactory manager = SessionFactoryManager.getSession();

    public void addRow(Shot shot) {
        Session session = manager.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(shot);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.getStatus() == TransactionStatus.MARKED_ROLLBACK || transaction.isActive())
                transaction.rollback();
        }

    }

    public List<Shot> getAll() {
        Session session = manager.openSession();
        Query query = session.createQuery("FROM Shot ");
        List<Shot> result = query.getResultList();
        return result;
    }


    public void clean() {
        Session currentSession = manager.getCurrentSession();
        currentSession.beginTransaction();
        currentSession.clear();
        currentSession.getTransaction().commit();
    }
}
