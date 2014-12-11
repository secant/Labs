/**
 * @author Vivian Fang, period 1
 * Compare 3; takes in three objects and compares them to find the largest one.
 * Rev. 12/10/14
 */
public class Compare3 implements Comparable
{
	public static Comparable largest(Comparable a, Comparable b, Comparable c)
	{
		Comparable largest = c; //assumes c if the below conditional is not met
		if(a.compareTo(c) > 0)
		{
			if(a.compareTo(b) > 0)
			{
				largest = a;
			}
			else
			{
				largest = b;
			}
		}
		return largest;
	}
}
