package CrockeryCutleryLab;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.time.LocalDate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class DiningSetIt {

    private static DiningSet  setMock;

    @Mock
    private Customer customer;

    @Before
    public void set() throws Exception{
        MockitoAnnotations.initMocks(this);
        when(customer.toString()).thenReturn("Mockito Customer");
        when(customer.getName()).thenReturn("Yehor");
        setMock = new DiningSet("FirstSet", LocalDate.of(2020,1,1),
                0,0,0,0,0,Material.Metal,
                customer);
    }


    @Test
    public void constructorWithCustomer_CheckAbstractConstructorValidnessWithMockito() throws Exception{
        assertEquals(LocalDate.of(2020,1,1), setMock.getDate());
        assertEquals("Mockito Customer", setMock.getCustomer().toString());
        assertEquals("Yehor", setMock.getCustomer().getName());
        verify(customer, times(1)).getName();
        assertEquals(Material.Metal, setMock.getMaterial());
        assertFalse(setMock.getMaterial().isFragile);

    }

}
