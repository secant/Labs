import java.util.Scanner;
public class TestAccount1 
{
	public static void main(String[] args)
	{
		Account acct1, acct2, acct3;
		String name;
		Scanner scan = new Scanner(System.in);
		
		/**Creating accounts**/
		System.out.println("Name: ");
		name = scan.nextLine();
		acct1 = new Account(100, name, 1);
		
		System.out.println("Name: ");
		name = scan.nextLine();
		acct2 = new Account(100, name, 2);
		
		System.out.println("Name: ");
		name = scan.nextLine();
		acct3 = new Account(100, name, 3);
		
		System.out.println(acct1 + "\n" + acct2 + "\n" + acct3);
		System.out.printf("There are %d accounts\n", Account.numAccounts());
		
		/**Consolidating accounts**/
		acct2 = Account.consolidate(acct2, acct3);
		
		/**Closing account 1**/
		acct1.close();
		
		/**Print result**/
		System.out.printf("Now there are %d accounts", Account.numAccounts());
	}
}
