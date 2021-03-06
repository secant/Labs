/**
 * @author Vivian Fang, period 1
 * References Compare3 class to compare three objects and return the largest one.
 * Rev. 12/10/14
 */
import java.util.Scanner;

public class Comparison 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 strings: ");
		String a = scan.nextLine();
		String b = scan.nextLine();
		String c = scan.nextLine();
		System.out.printf("The largest string out of the set {%s, %s, %s} is %s\n", a, b, c, Compare3.largest(a,b,c));
	
		System.out.println("Enter 3 integers: ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		System.out.printf("The largest integer out of the set {%d, %d, %d} is %d\n", x, y, z, Compare3.largest(x,y,z));
	}
}