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

public class TeaSetIt {

    private static TeaSet setErrors;

    @Mock
    private Customer customer;
    @Before
    public void set() throws Exception{
        MockitoAnnotations.initMocks(this);
        when(customer.toString()).thenReturn("Mockito Customer");
        when(customer.getSurname()).thenReturn("Nikishenko");
        setErrors = new TeaSet("Error Test", LocalDate.of(2020, 9, 12),
                1, 2, 3, 4, 5, Material.Porcelain,
                customer);

    }

    @Test
    public void constructorWithCustomer_CheckAbstractConstructorValidnessWithMockito(){
        assertEquals("Mockito Customer", setErrors.getCustomer().toString());
        assertEquals("Nikishenko", setErrors.getCustomer().getSurname());
        verify(customer, times(1)).getSurname();

    }

}
