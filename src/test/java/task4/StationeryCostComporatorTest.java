package task4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Вениамин on 7/9/2017.
 */
public class StationeryCostComporatorTest {
    @Test
    public void compare() throws Exception {
        StationeryCostComporator comp = new StationeryCostComporator();
        Stationery o1 = new Stationery("name 1",55);
        Stationery o2 = new Stationery("name 2",29.3);
        int result = comp.compare(o1,o2);
        assertEquals(result,1);
    }

    @Test
    public void compare1() throws Exception {
        StationeryCostComporator comp = new StationeryCostComporator();
        Stationery o1 = new Stationery("name 1",55.6);
        Stationery o2 = new Stationery("name 2",55.6);
        int result = comp.compare(o1,o2);
        assertEquals(result,0);
    }

    @Test
    public void compare2() throws Exception {
        StationeryCostComporator comp = new StationeryCostComporator();
        Stationery o1 = new Stationery("name 1",50.6);
        Stationery o2 = new Stationery("name 2",55.6);
        int result = comp.compare(o1,o2);
        assertEquals(result,-1);
    }

}