package sem5.model;

public class Student extends User {
    private Integer studentID;


    public Student(Integer studentID, String firstName, String secondName, String thirdName) {
        super(firstName, secondName, thirdName);
        this.studentID = studentID;
    }

    public Student(Integer studentID, String firstName, String lastName) {
        super(firstName, lastName);
        this.studentID = studentID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "№:" + studentID + " "
                + super.getFirstName() + " "
                + super.getSecondName() + " "
                + super.getLastName() +
                '}';
    }
}
