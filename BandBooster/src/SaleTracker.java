import java.util.Scanner;
public class SaleTracker 
{

	public static void main(String[] args) 
	{
		String boosterName;
		
		/**Initialize Scanner**/
		Scanner scan = new Scanner(System.in);
		
		/**Read in names of two band boosters and create an object with their name**/
		System.out.println("Please enter the name of the first band booster: ");
		boosterName = scan.next();
		BandBooster b1 = new BandBooster(boosterName);
		System.out.println("Please enter the name of the second band booster: ");
		boosterName = scan.next();
		BandBooster b2 = new BandBooster(boosterName);
		
		/**Begin sales tally over three weeks**/
		/**Booster 1**/
		for(int i = 0; i < 3; i++)
		{
			System.out.printf("\nEnter the number of sales for %s during week %d: ", b1.getName(), i+1);
			b1.updateSales(scan.nextInt());	
		}
		
		/**Booster 2**/
		for(int i = 0; i < 3; i++)
		{
			System.out.printf("\nEnter the number of sales for %s during week %d: ", b2.getName(), i+1);
			b2.updateSales(scan.nextInt());	
		}
		
		/**Print the results**/
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}

}
