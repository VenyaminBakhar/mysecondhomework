package task4;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Вениамин on 7/7/2017.
 */
public class Main  {

    static ArrayList<Stationery> stationeries = new ArrayList<Stationery>();

    public static void main(String[] args) {
        stationeries.add(new Stationery("Pen",10));
        stationeries.add(new Stationery("Pen",15));
        stationeries.add(new Stationery("Pen",7));
        stationeries.add(new Stationery("Pencil",13));
        stationeries.add(new Stationery("Paper",30));
        stationeries.add(new Stationery("Book",78));
        stationeries.add(new Stationery("Ruler",15));
        //Comparator that compare our objects following their "Cost" field
        StationeryCostComporator stationeryCostComporator = new StationeryCostComporator();
        TreeSet<Stationery> stationeries1 = new TreeSet<Stationery>(stationeryCostComporator);

        //Comparator that compare our objects following their "Name" field
        StationeryNameComporator stationeryNameComporator = new StationeryNameComporator();
        TreeSet<Stationery> stationeries2 = new TreeSet<Stationery>(stationeryNameComporator);

        //Comparator that compare our objects following their "Cost" field and then following their "Name" field
//        Comparator<Stationery> comparator = new StationeryCostComporator().thenComparing(new StationeryNameComporator());
        Comparator<Stationery>  comparator = new StationeryCostComporator().thenComparing(new StationeryNameComporator());
        TreeSet<Stationery> stationeries3  = new TreeSet<Stationery>(comparator);

        for (Stationery s: stationeries){
            stationeries1.add(s);
            stationeries2.add(s);
            stationeries3.add(s);
        }

        for (Stationery s : stationeries1){
            System.out.println(s.getName()+" "+s.getCost());
        }

        System.out.println("");

        for (Stationery s : stationeries2){
            System.out.println(s.getName()+" "+s.getCost());
        }

        System.out.println("");

        for (Stationery s : stationeries3){
            System.out.println(s.getName()+" "+s.getCost());
        }


    }
}
