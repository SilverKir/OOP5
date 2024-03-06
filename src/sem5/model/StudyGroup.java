package sem5.model;

import java.util.List;

public class StudyGroup {
    private Integer studyGroupID;
    private Teacher teacher;
    private List<Student> studentList;

    public StudyGroup(Integer studyGroupID,Teacher teacher, List<Student> studentList) {
        this.studyGroupID=studyGroupID;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher.toString() +
                ", studentList=" + studentList +
                '}';
    }
}
