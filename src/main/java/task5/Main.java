package task5;

/**
 * Created by Вениамин on 7/10/2017.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("lol");
        student.addSubject(new Math(4.5));
        student.addSubject(new Russian(5));
        student.addSubject(new English(4));
        student.addSubject(new Sport(3.2));
        for (Subject subject : student.subjects){
            System.out.println(subject.getMark()+" "+subject.getSubEnum());
        }


    }
}
