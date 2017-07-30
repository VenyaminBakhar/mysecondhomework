package task5;

/**
 * Created by Вениамин on 7/9/2017.
 */
class Russian extends Subject{


    Russian(int mark){
        this.sub = SubjectsEnum.RUS;
        this.mark =(double) mark;
    }


    public double getMark() {return this.mark;}


    SubjectsEnum getSubEnum() {return this.sub;}



}
