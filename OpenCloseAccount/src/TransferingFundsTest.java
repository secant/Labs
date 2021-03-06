import java.util.Scanner;
public class TransferingFundsTest 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Account acct1, acct2;
		acct1 = new Account(1000, "Bob", 4);
		acct2 = new Account(2000, "Joe", 5);
		int option = 0;
		double amount = 0;
		while(option !=3)
		{
			System.out.println("Option 1: Transfer from account1 to account2 (enter 1)");
			System.out.println("Option 2: Transfer from account2 to account1 (enter 2)");
			System.out.println("Option 3: Quit (enter 3)");
			option = scan.nextInt();
			if(option == 1)
			{
				System.out.println("How much to transfer? ");
				amount = scan.nextDouble();
				Account.transfer(acct1, acct2, amount);
				System.out.println(acct1.toString() + "\n" + acct2.toString() + "\n");
			}
			if(option == 2)
			{
				System.out.println("How much to transfer? ");
				amount = scan.nextDouble();
				Account.transfer(acct2, acct1, amount);
				System.out.println(acct1.toString() + "\n" + acct2.toString() + "\n");
			}
		}
	}
}
