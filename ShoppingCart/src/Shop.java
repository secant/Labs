/**
 * Shop.java
 * Author: Vivian Fang, pd. 1
 * Revised 02/15/15
 * Uses the Item class to create items and add them to a shopping
 * cart stored in an ArrayList. 
 */

import java.util.ArrayList; 
import java.util.Scanner;
import java.text.NumberFormat;

public class Shop
{
	public static void main (String[] args) 
	{
		ArrayList<Item> cart = new ArrayList<Item>();
		Item item;
		Item itemTemp;
	    String itemName;
	    double itemPrice;
	    int quantity;
	    double totalPrice = 0;
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
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
			item = new Item(itemName, itemPrice, quantity);
			cart.add(item);
			
			// *** print the contents of the cart object using println
			for(int i = 0; i < cart.size(); i++)
			{
				System.out.println(cart.get(i));
				itemTemp = cart.get(i);
				totalPrice += (itemTemp.getPrice() * itemTemp.getQuantity());
			}
			System.out.println("Total Price: " + fmt.format(totalPrice));
			totalPrice = 0;
			
			System.out.print ("Continue shopping (y/n)? ");
			keepShopping = scan.next(); 
			scan.nextLine();
		}
		while (keepShopping.equals("y"));
	} 
}