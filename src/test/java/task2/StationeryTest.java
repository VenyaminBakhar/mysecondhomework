package task2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Вениамин on 7/5/2017.
 */
public class StationeryTest {
    @Test
    public void addProduct() throws Exception {
        Stationery st = new Stationery("petya");
        st.addProduct("pen",12);
        st.addProduct("paper",240);
        ArrayList<String> name = new ArrayList<String>();
        name.add("pen");
        name.add("paper");
        ArrayList<Integer> cost = new ArrayList<Integer>();
        cost.add(12);
        cost.add(240);
        assertEquals(name,st.getStationeryName());
        assertEquals(cost,st.getStationeryCost());

    }

    @Test
    public void fullCost() throws Exception {
        Stationery st = new Stationery("petya");
        st.addProduct("pen",12);
        st.addProduct("paper",240);
        assertEquals(st.fullCost(),252);
    }

}