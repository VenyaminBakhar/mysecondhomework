package task3;

/**
 * Created by Вениамин on 7/6/2017.
 */
class Colorpencil extends Pencil{

    private String kernelColor;

    Colorpencil(double productCost, String description, double pencilDiametr, double kernelDiametr,String kernelColor) {
        super(productCost, description, pencilDiametr, kernelDiametr);
        this.kernelColor = kernelColor;
    }
}
