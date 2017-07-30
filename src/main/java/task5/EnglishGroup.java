package task5;

import java.util.ArrayList;

/**
 * Created by Вениамин on 7/10/2017.
 */
public class EnglishGroup extends Group {


    EnglishGroup(){
        this.subjectsEnum = SubjectsEnum.ENG;
        this.students = new ArrayList<Student>();
    }


    void addStudent(Student student) {
        this.students.add(student);
    }
}
