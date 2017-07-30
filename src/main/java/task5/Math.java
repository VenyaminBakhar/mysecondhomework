package task5;

/**
 * Created by Вениамин on 7/9/2017.
 */
class Math extends Subject  {


    Math(double mark){
        this.sub = SubjectsEnum.MATH;
        this.mark = mark;
    }


    double getMark() {
        return this.mark;
    }


    SubjectsEnum getSubEnum() {return this.sub;}




}
