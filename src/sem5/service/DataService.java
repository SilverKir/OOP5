package sem5.service;

import sem5.model.Student;
import sem5.model.Teacher;
import sem5.model.Type;
import sem5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> users = new ArrayList<>();
    public  void create(String firstName, String secondName, String thirdName, Type type){
        int id=getFreeId(type);
        if (type==Type.STUDENT){
            users.add(new Student(id, firstName, secondName,thirdName));
        } else if (type==Type.TEACHER){
            users.add(new Teacher(id, firstName, secondName,thirdName));
        }
    }
public int getFreeId(Type type){
        boolean isStudent=type==Type.STUDENT;
        int lastId=1;
    for (User user : users) {
        if (user instanceof Student && isStudent){
            lastId= ((Student) user).getStudentID()+1;
        } else if (user instanceof Teacher&& !isStudent){
            lastId= ((Teacher) user).getTeacherID()+1;
        }
    }
    return  lastId;
}


    public List<User> getUsers() {
        return users;
    }

    public List<Student> getStudents(){
        List<Student> studentList=new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student){
                studentList.add((Student) user);
            }
        }
        return studentList;
    }
    public List<Teacher> getTeachers(){
        List<Teacher> teacherList=new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher){
                teacherList.add((Teacher) user);
            }
        }
        return teacherList;
    }
}
