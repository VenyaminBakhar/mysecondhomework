package task5;

/**
 * Created by Вениамин on 7/9/2017.
 */
class Sport extends Subject{

    Sport(double mark){
        this.sub = SubjectsEnum.SPORT;
        this.mark = mark;
    }


    public double getMark() {return this.mark;}


    SubjectsEnum getSubEnum() {return this.sub;}



}
