import java.util.Scanner;

public class TestingNames 
{

	public static void main(String[] args) 
	{
		/**Initialize Scanner**/
		Scanner scan = new Scanner(System.in);
		
		/**Initialize variables to hold user input**/
		String firstN, middleN, lastN;
		
		/**Prompt user to enter two names**/
		System.out.printf("Enter the first name of person 1: ");
		firstN = scan.nextLine();
		System.out.printf("\nEnter the middle name of person 1: ");
		middleN = scan.nextLine();
		System.out.printf("\nEnter the last name of person 1: ");
		lastN = scan.nextLine();
		Name n1 = new Name(firstN, middleN, lastN);
		System.out.printf("\nEnter the first name of person 2: ");
		firstN = scan.nextLine();
		System.out.printf("\nEnter the middle name of person 2: ");
		middleN = scan.nextLine();
		System.out.printf("\nEnter the last name of person 2: ");
		lastN = scan.nextLine();
		Name n2 = new Name(firstN, middleN, lastN);
		
		/**Print first-middle-last**/
		System.out.println("First-middle-last: " + n1.firstMiddleLast());
		System.out.println("First-middle-last: " + n2.firstMiddleLast());
		
		/**Print last-first-middle**/
		System.out.println("Last-first-middle: " + n1.lastFirstMiddle());
		System.out.println("Last-first-middle: " + n2.lastFirstMiddle());
		
		/**Print initials**/
		System.out.println("Initials: " + n1.intials());
		System.out.println("Initials: " + n2.intials());
		
		/**Print length**/
		System.out.println("Length: " + n1.length());
		System.out.println("Length: " + n2.length());
		
		/**Check if two names are equal**/
		System.out.println("The names are equal: " + n1.equals(n2));
	}

}
