/**
 * Sales.java
 * Author: Vivian Fang, pd. 1
 * Last modified: 01/12/2015
 * This program
 * (1) Asks the user for the amount of sales to input
 * (2) Returns the average, max, and min of the entered sales
 * (3) Asks the user to enter a sales number
 * (4) Returns the sales IDs of all the people who met or exceeded that number
 *     and the amount of people who met or exceeded that number.
 */
 
import java.util.Scanner;
public class Sales
{
	public static void main(String[] args) 
	{
		int sum; //keeps track of total sales
		int salesPeople = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("How many sales are you entering?: ");
		salesPeople = scan.nextInt();
		int[] sales = new int[salesPeople]; //creates an array with salesPeople amount of
											//space
		System.out.print("Enter sales for salesperson " + 1 + ": $");
		sales[0] = scan.nextInt();
		int minSale = sales[0];
		int maxSale = sales[0];
		for (int i=1; i<sales.length; i++) //function takes care of rest of the entries
		{
			System.out.print("Enter sales for salesperson " + (i + 1) + ": $");
	        sales[i] = scan.nextInt();
	        if (sales [i] > maxSale)
	        {
	        	maxSale = sales[i];
	        }
	        if (sales [i] < minSale)
	        {
	        	minSale = sales[i];
	        }
	    }
		System.out.println("\nSalesperson Sales"); System.out.println("----------------"); 
		sum = 0;
		for (int i = 0; i < sales.length; i++) //function adds all the sales in the array
		{
			sum += sales[i];
	    }
		System.out.println("Total sales: " + sum); 
		System.out.println("Average sales: " + (double) sum / salesPeople);
		System.out.println("Highest sale: " + maxSale);
		System.out.println("Minimum sale: " + minSale);
		
		System.out.println("\nEnter a sales value.");
		System.out.println("This will return the IDs of people who met or exceeded that value.");
		int threshold = scan.nextInt();
		int counter = 0;
		for(int i=0; i < sales.length; i++)
		{
			if(sales[i] >= threshold)
			{
				System.out.printf("Salesperson #%d: $%d \n", i, sales[i]);
				counter++;
			}
		}
		System.out.print("Total: " + counter);		
	}
}