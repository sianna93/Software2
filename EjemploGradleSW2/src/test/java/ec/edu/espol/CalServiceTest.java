package ec.edu.espol;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mockito;

//import junit.framework.Assert;

public class CalServiceTest {
	
	CalService calService;
	
	@Before //se ejecuta antes de que se ejecuten las pruebas
	public void setup(){
		ICalculator cal = Mockito.mock(ICalculator.class);
		Mockito.when(cal.add(3,3)).thenReturn(6);
		
		calService = new CalService();
		calService.setCal(cal);
	}
	
	
	//@SuppressWarnings("deprecation")
	@Test
	//existe un problema con esta funcion, puntero a null, como no tengo toda la parte de mi proyecto
	//porque se esta haciendo integracion, haremos un MOCK (MOCKITO)
	public void testAddTwoNumbers(){
	
		Assert.assertEquals(6,calService.AddTwoNumbers(3, 3));
	}

}
