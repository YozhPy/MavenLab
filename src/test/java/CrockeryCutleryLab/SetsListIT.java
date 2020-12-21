package CrockeryCutleryLab;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.time.LocalDate;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.*;

public class SetsListIT {
    private ArrayList<DinnerSet> list;
    private SetsList setTest;
    private DiningSet mockDining;

    @Before
    public void setUp(){
        list = spy(new ArrayList<>());

        mockDining = new DiningSet("SecondSet",LocalDate.of(2020,2,4),
                2,2,2,2,2,Material.Plastic);

        setTest = new SetsList("Test SetsList", list);
    }

    @Test
    public void checkAddingToListUsingSpy(){
        setTest.addOrder(mockDining);
        setTest.addOrder(mockDining);
        setTest.addOrder(mockDining);
        setTest.addOrder(mockDining);
        setTest.addOrder(mockDining);
        verify(list,times(5)).add(mockDining);
        assertEquals(5, list.size());
    }

}
