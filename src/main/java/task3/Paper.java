package task3;

/**
 * Created by Вениамин on 7/6/2017.
 */
class Paper extends Stationery{

    int countOfLists;

    Paper(double productCost, String description, int countOfLists){
        this.productCost = productCost;
        this.description = description;
        this.countOfLists = countOfLists;
    }
}
