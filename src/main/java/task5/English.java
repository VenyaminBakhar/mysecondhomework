package task5;

/**
 * Created by Вениамин on 7/9/2017.
 */
class English extends Subject {


    English(int mark){
        this.sub = SubjectsEnum.ENG;
        this.mark = (double) mark;
    }


    double getMark() {return this.mark;}


    SubjectsEnum getSubEnum() {return this.sub;}



}
