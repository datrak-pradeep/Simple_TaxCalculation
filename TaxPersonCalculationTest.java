package testCases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Pradeep.TaxPersonCalculation;


public class TaxPersonCalculationTest {

	@SuppressWarnings("deprecation")
			TaxPersonCalculation tpc = new TaxPersonCalculation();
			@Test
			public void testNessesaryItemtotal() throws Exception
			{
				assertEquals(tpc.nessesaryItemtotal(1,11.00,0.11),11.11);
				assertEquals(tpc.nessesaryItemtotal(1,25.0,0.25),25.25);
				assertEquals(tpc.nessesaryItemtotal(1,220.0,2.2),222.2);
				
			}
			@Test
			public void testluxaryItemtotal() {
				assertEquals(tpc.luxaryItemtotal(2,150.0,13.5),163.5);
				assertEquals(tpc.luxaryItemtotal(2,25.0,2.25),27.25);
				assertEquals(tpc.luxaryItemtotal(2,5.0,0.44),5.45);
			}
}


	

