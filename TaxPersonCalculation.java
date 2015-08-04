package Pradeep;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;



public class TaxPersonCalculation {

	public static void main(String[] args) throws Exception {
		// identifier declarations
		double price = 0; 
		double tax = 0; 
		double total = 0; 
		int item; 

		// Create a Scanner object to read from the keyboard
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		// Read and Store inputs from user
		System.out.print("Enter Item Code  :  "); 
		item = Integer.valueOf(keyboard.nextLine()); 
		System.out.print("Item price:  $"); 
		price = keyboard.nextDouble(); 
		//Calculate Total based on Item entered by user input
		if (item == 1) {
			nessesaryItemtotal(item,price,tax);
		} else if (item == 2) {
			luxaryItemtotal(item,price,tax);
		} else {
			throw (new Exception("Invalid item code is provided. It should be 1 or 2"));
		}
		
	}
	/**
	 * This Method is to calculate Nesseary Items tax with total
	 * @param item
	 * @param price
	 * @param tax
	 * @return total
	 */

	public static double nessesaryItemtotal(int item,double price, double tax) {
		double TAX_RATE = 0.01;
		tax = price * TAX_RATE; 
		double total = price + (price * TAX_RATE); 
		// Print total after tax calculations
		System.out.println("Item purchased: " + item+ "-It is Nessesary Item and tax will be 1%");
		System.out.println("Price                 $" + price);
		System.out.println("Tax                   $" + tax);
		System.out.println("Total                 $" + total);

		return total;
	}

	/**
	 * This Method is to calculate Luxary Items tax with total
	 * @param item
	 * @param price
	 * @param tax
	 * @return total
	 */
	public static double luxaryItemtotal(int item,double price,double tax) {
		double TAX_RATE = 0.09;
		tax = price * TAX_RATE; 
		double total = price + (price * TAX_RATE); 
		// Print total after tax calculations
		System.out.println("Item purchased is: " + item + " -It is Luxary Item and tax will be 9%");
		System.out.println("Price                 $" + price);
		System.out.println("Tax                   $" + tax);
		System.out.println("Total                 $" + total);

		return total;
	}
	
	

}
