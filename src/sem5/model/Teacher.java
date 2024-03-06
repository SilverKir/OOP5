package sem5.model;

public class Teacher extends User {
    private Integer teacherID;

    public Teacher(Integer teacherID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "ID=" + teacherID + " "
                + super.getFirstName() + " "
                + super.getSecondName() + " "
                + super.getLastName() +
                '}';
    }
}
