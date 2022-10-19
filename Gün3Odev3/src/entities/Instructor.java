package entities;

public class Instructor {
    private int id;
    private String instructorName;

    public Instructor(int id, String instructorName) {
        super();
        this.id = id;
        this.instructorName = instructorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }



}
