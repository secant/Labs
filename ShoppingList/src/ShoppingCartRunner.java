/**
 * ShoppingCartRunne.java
 * Author: Vivian Fang, pd. 1
 * Revised 02/15/15
 * Runs the ShoppingCart class and simulates a shopping cart.
 */

import java.util.Scanner;

public class ShoppingCartRunner 
{
	public static void main(String[] args) 
	{
		ShoppingCart cart = new ShoppingCart();
	    String itemName;
	    double itemPrice;
	    int quantity;
		Scanner scan = new Scanner(System.in);
		String keepShopping = "y";
		do
		{
			System.out.print ("Enter the name of the item: "); 
			itemName = scan.nextLine();
			System.out.print ("Enter the unit price: "); 
			itemPrice = scan.nextDouble();
			System.out.print ("Enter the quantity: "); 
			quantity = scan.nextInt();
			// *** create a new item and add it to the cart
			cart.addToCart(itemName, itemPrice, quantity);
			
			System.out.println(cart);
			
			System.out.print ("Continue shopping (y/n)? ");
			keepShopping = scan.next(); 
			scan.nextLine();
		}
		while (keepShopping.equals("y"));
	}

}
