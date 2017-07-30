package task3;

/**
 * Created by Вениамин on 7/6/2017.
 */
class Pencil extends Stationery {

    protected double pencilDiametr;

    protected double kernelDiametr;

    Pencil(double productCost, String description,double pencilDiametr,double kernelDiametr){
        this.productCost = productCost;
        this.description = description;
        this.pencilDiametr = pencilDiametr;
        this.kernelDiametr = kernelDiametr;
    }


}
