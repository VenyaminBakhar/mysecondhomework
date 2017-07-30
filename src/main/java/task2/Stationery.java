package task2;

import java.util.ArrayList;

/**
 * Created by Вениамин on 7/5/2017.
 */
public class Stationery {

    private String workersName;

    private ArrayList<String> stationeryName ;

    private ArrayList<Integer> stationeryCost ;

    public Stationery (String workersName){
        this.workersName = workersName;
        stationeryName = new ArrayList<String>();
        stationeryCost = new ArrayList<Integer>();
    }

    protected void addProduct(String name,int cost){
        this.stationeryCost.add(cost);
        this.stationeryName.add(name);
    }

    protected int fullCost(){
        int fullCost = 0;
        for (int i = 0; i < this.stationeryCost.size();i++){
            fullCost+=this.stationeryCost.get(i);
        }
        return fullCost;
    }

    public String getWorkersName() {
        return workersName;
    }

    public void setWorkersName(String workersName) {
        this.workersName = workersName;
    }

    public ArrayList<String> getStationeryName() {
        return stationeryName;
    }

    public void setStationeryName(ArrayList<String> stationeryName) {
        this.stationeryName = stationeryName;
    }

    public ArrayList<Integer> getStationeryCost() {
        return stationeryCost;
    }

    public void setStationeryCost(ArrayList<Integer> stationeryCost) {
        this.stationeryCost = stationeryCost;
    }
}
