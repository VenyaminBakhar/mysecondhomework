package task5;

import java.util.ArrayList;

/**
 * Created by Вениамин on 7/9/2017.
 */
class Student {


    String name;
    ArrayList<Subject> subjects;


    Student(String name){
        this.name =  name;
        this.subjects = new ArrayList<Subject>();
    }


    void addSubject(Subject sub){
        this.subjects.add(sub);
    }



}
