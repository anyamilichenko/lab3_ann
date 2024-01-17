package lab3.database;

import lab3.entity.Shot;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryManager {
    private static SessionFactory sessionFactory;

    private SessionFactoryManager() {
    }

    public static SessionFactory getSession() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
                sessionFactory = configuration.buildSessionFactory();
            } catch (Exception e) {
                System.out.println("Exception in Session Factory Manager");
            }
        }
        return sessionFactory;
    }
}
