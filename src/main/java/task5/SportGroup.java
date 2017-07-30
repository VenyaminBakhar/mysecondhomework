package task5;

import java.util.ArrayList;

/**
 * Created by Вениамин on 7/10/2017.
 */
public class SportGroup extends Group{


    SportGroup() {
        this.subjectsEnum = SubjectsEnum.SPORT;
        this.students = new ArrayList<Student>();
    }


    void addStudent(Student student) {
        this.students.add(student);
    }
}
