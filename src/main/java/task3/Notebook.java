package task3;

/**
 * Created by Вениамин on 7/6/2017.
 */
class Notebook extends Paper{

    private boolean islinedPaper;

    Notebook(double productCost, String description, int countOfLists,boolean islinedPaper) {
        super(productCost, description, countOfLists);
        this.islinedPaper = islinedPaper;
    }
}
