package CrockeryCutleryLab;

import org.junit.Before;
import org.junit.Test;


import java.util.LinkedHashMap;
import java.time.LocalDate;

import static org.junit.Assert.*;
public class DiningSetTest {

    private static DiningSet set2;

    @Before
    public void set() throws Exception{
        set2 = new DiningSet("SecondSet",LocalDate.of(2020,2,4),
                            2,2,2,2,2,Material.Plastic);
    }


    @Test
    public void constructorWithoutCustomer_CheckAbstractConstructorValidness() throws Exception{
        assertEquals(LocalDate.of(2020,2,4), set2.getDate());
        assertEquals("Anonim Anonim ", set2.getCustomer().toString());
        assertEquals(Material.Plastic, set2.getMaterial());
        assertFalse(set2.getMaterial().isFragile);
    }

    @Test
    public void findCost_CheckValidness_Int() throws Exception{
        assertEquals(342, set2.find_cost());
    }

}