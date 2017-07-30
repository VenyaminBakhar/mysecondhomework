package task3;

import java.util.ArrayList;

/**
 * Created by Вениамин on 7/6/2017.
 */
class Begginerskit extends Stationery {

    ArrayList<Stationery> begginerskitslist;

    public Begginerskit(){
        Stationery pencil = new Pencil(15,"pencil",15,0.5);
        Stationery linedNotebook = new Notebook(10,"lined notebook",48,true);
        Stationery squaredNotebook = new Notebook(15," squared notebook",48,false);
        Stationery book = new Book(35,"Math",78,"autor","math for babies");
        this.begginerskitslist = new ArrayList<Stationery>();
        begginerskitslist.add(pencil);
        begginerskitslist.add(linedNotebook);
        begginerskitslist.add(book);
        begginerskitslist.add(squaredNotebook);
        this.productCost = pencil.productCost+linedNotebook.productCost+squaredNotebook.productCost+book.productCost;
        this.description = "Begginer's kit include pencil,notebook and book";

    }




}
