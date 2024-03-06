package sem5.service;

import sem5.model.*;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
 private List<StudyGroup> studyGroups=new ArrayList<>();

 public void create (Teacher teacher, List<Student> studentList){
     studyGroups.add(new StudyGroup(getFreeId(),teacher,studentList));
 }

    public int getFreeId(){
        return !studyGroups.isEmpty() ? studyGroups.size()+1 : 1;
    }


    public List<StudyGroup> getStudyGroups() {
        return studyGroups;
    }
}
