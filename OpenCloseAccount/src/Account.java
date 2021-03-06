/**
 * @author Vivian Fang, period 1
 * Bank Account Class (All parts)
 * Rev. 12/9/2014
 */
public class Account 
{
	private double balance;
	private String name;
	private long acctNum; 
	
	//***Opening and Closing Accounts***//
	private static int numAcct; //stores number of accounts created
	
	//**Counting Transactions**//
	private static int wthdrwl; //stores number of withdrawals in a given day
	private static int dpst; //stores number of deposits in a given day
	private static double totalWithdraw; //stores total value of withdrawals in a given day
	private static double totalDeposit; //stores total value of deposits in a given day

	public Account(double initBal, String owner, long number) // Constructor --initializes balance, owner, and account number
	{
		balance = initBal;
		name = owner;
		acctNum = number;
		numAcct++;
	}

	public void withdraw(double amount) // Checks to see if balance is sufficient for withdrawal.
										//If so, decrements balance by amount; if not, prints message.
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}

	public void deposit(double amount) // Adds deposit amount to balance.
	{
		balance += amount;
	}

	public double getBalance() // Returns balance.
	{
		return balance;
	}

	public String toString() // Returns a string containing the name, account number, and balance.
	{
		return String.format("Name: %s\nAcct #: %d\nBalance: $%.2f", name, acctNum, balance);
	}

	public double chargeFee() // Deducts $10 service fee
	{
		balance -= 10;
		return balance;
	}

	public String changeName(String newName) // Changes the name on the account
	{
		name = newName;
		return name;
	}
	
	public static int numAccounts() // Returns number of accounts
	{
		return numAcct;
	}
	
	//***Opening and Closing Accounts***//
	public void close() // Appends "CLOSED" to account name and sets balance to 0
	{
		name = name.concat("CLOSED");
		balance = 0;
		numAcct--;
	}
	
	public static Account consolidate(Account acct1, Account acct2)
	{
		if(acct1.name.equals(acct2.name) && acct1.acctNum != acct2.acctNum)
		{
			double newBal = acct1.balance + acct2.balance;
			Account newAcct = new Account (newBal, acct1.name, acct1.acctNum);
			acct1.close();
			acct2.close();
			return newAcct;
		}
		else
		{
			return null;
		}
	}
	
	//***Counting Transactions***//
	public static int numWithdrawals() // Returns number of accounts
	{
		return wthdrwl;
	}
	
	public static int numDeposits() // Returns number of accounts
	{
		return dpst;
	}
	
	public static double totalWithdraw() // Returns number of accounts
	{
		return totalWithdraw;
	}
	
	public static double totalDeposit() // Returns number of accounts
	{
		return totalDeposit;
	}
	
	//**Transferring Funds**//
	public void transfer(Account acct, double amount) //first function, transfers money from declared account to acct
	{
		if(balance >= amount) //checks if there is enough money
		{
			acct.balance += amount;
			withdraw(amount);
			System.out.printf("\n$%.2f was transferred FROM %s TO %s. \n", amount, name, acct.name);
		}
		else
		{
			System.out.println("Insufficient funds");
		}
	}
	
	public static void transfer(Account acct1, Account acct2, double amount) //second function, transfers money from acct1 to acct2
	{
		if(acct1.balance >= amount) 
		{
			acct2.deposit(amount);
			acct1.withdraw(amount);
			System.out.printf("\n$%.2f was transferred FROM %s TO %s. \n", amount, acct1.name, acct2.name);
		}
		else
		{
			System.out.println("Insufficient funds");
		}
	}
}
