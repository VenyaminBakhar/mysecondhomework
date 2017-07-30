package task4;

import java.util.Comparator;

/**
 * Created by Вениамин on 7/7/2017.
 */
 class StationeryNameComporator implements Comparator<Stationery> {

    public int compare(Stationery o1, Stationery o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
