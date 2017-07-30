package task5;

import java.util.ArrayList;

/**
 * Created by Вениамин on 7/10/2017.
 */
public class MathGroup extends Group {


    MathGroup() {
        this.subjectsEnum = SubjectsEnum.MATH;
        this.students = new ArrayList<Student>();
    }


    void addStudent(Student student) {
        this.students.add(student);
    }
}
