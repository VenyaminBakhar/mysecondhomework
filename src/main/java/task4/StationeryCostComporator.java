package task4;

import java.util.Comparator;

/**
 * Created by Вениамин on 7/7/2017.
 */
 class StationeryCostComporator implements Comparator<Stationery>{
    public int compare(Stationery o1, Stationery o2) {

        if(o1.getCost()>o2.getCost()) return 1;
        else if (o1.getCost()<o2.getCost()) return -1;
        else return 0;
    }
}
