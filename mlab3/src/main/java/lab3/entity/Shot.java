package lab3.entity;


import javax.persistence.*;


@Entity
@Table(name = "shot")
public class Shot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "x", nullable = false)
    private double x;

    @Column(name = "y", nullable = false)
    private double y;
    @Column(name = "r", nullable = false)
    private double r;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "cur_time", nullable = false)
    private String cur_time;

    @Column(name = "script_time", nullable = false)
    private long script_time;

    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }



    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCur_time() {
        return cur_time;
    }

    public void setCur_time(String cur_time) {
        this.cur_time = cur_time;
    }

    public long getScript_time() {
        return script_time;
    }

    public void setScript_time(long script_time) {
        this.script_time = script_time;
    }


}
