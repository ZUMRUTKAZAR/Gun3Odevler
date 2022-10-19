package entities;

public class Course {
    private int id;
    private String CourseName;
    private double unitPrice;

    public Course(int id, String courseName, double unitPrice) {
        super();
        this.id = id;
        this.CourseName = courseName;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
