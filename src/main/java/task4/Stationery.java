package task4;

/**
 * Created by Вениамин on 7/7/2017.
 */
public class Stationery {

    private String name;
    private double cost;

    Stationery(String name,double cost){
        this.name = name;
        this.cost = cost;
    }

    String getName() {
        return name;
    }

    double getCost() {
        return cost;
    }
}
