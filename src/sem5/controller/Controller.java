package sem5.controller;

import sem5.model.*;
import sem5.service.DataService;
import sem5.service.StudyGroupService;
import sem5.view.StudentView;
import sem5.view.StudyGroupView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private final StudyGroupService groupService = new StudyGroupService();
    private final StudyGroupView groupView = new StudyGroupView();

    public void createStudent(String firstName, String secondName, String lastName) {
        service.create(firstName, secondName, lastName, Type.STUDENT);

    }
    
    public void createTeacher(String firstName, String secondName, String lastName) {
        service.create(firstName, secondName, lastName, Type.TEACHER);

    }

    public void printStudents() {
        for (Student user : service.getStudents()) {
            view.printOnConsole(user);
        }
    }

    public void createGroup(String firstName, String secondName, String lastName) {
        createTeacher(firstName, secondName,lastName);
        groupService.create(service.getTeachers().get(service.getTeachers().size()-1), service.getStudents());
    }

     public void  printGroup(){
         for (StudyGroup studyGroup : groupService.getStudyGroups()) {
             groupView.printStudyGroup(studyGroup);
         }
     }

}
