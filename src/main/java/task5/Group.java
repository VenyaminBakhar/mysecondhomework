package task5;

import java.util.ArrayList;

/**
 * Created by Вениамин on 7/10/2017.
 */
abstract class Group {


    SubjectsEnum subjectsEnum;


    ArrayList<Student> students;


    abstract void addStudent(Student student);
}
