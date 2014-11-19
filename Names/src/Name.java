/***
 * 
 * @author Vivian
 *
 */
public class Name 
{
	private String first, middle, last; //parameters of objects
	
	/**Constructor**/
	public Name(String firstName, String middleName, String lastName)
	{
		first = firstName;
		middle = middleName;
		last = lastName;
	}
	
	/**Functions for returning first, middle, and last names, respectively**/
	public String getFirst()
	{
		return first;
	}
	public String getMiddle()
	{
		return middle;
	}
	public String getLast()
	{
		return last;
	}
	
	/**Return person's name in order**/
	public String firstMiddleLast()
	{
		return String.format("%s %s %s", first, middle, last);
	}
	
	/**Return person's last name, first, and middle name**/
	public String lastFirstMiddle()
	{
		return String.format("%s, %s %s", last, first, middle);
	}
	
	/**Check if one name is equal to the other**/
	public boolean equals(Name otherName)
	{
		if(first.equalsIgnoreCase(otherName.getFirst()) && middle.equalsIgnoreCase(otherName.getMiddle()) && last.equalsIgnoreCase(otherName.getLast()))
			return true;
		else
			return false;
	}
	
	/**Return the initials of a name, all in upper case**/
	public String intials()
	{
		return String.format("%s%s%s", first.substring(0,1), middle.substring(0,1), last.substring(0,1)).toUpperCase();
	}
	
	/**Return the length of a full name, excluding spaces between first, middle, and last name**/
	public int length()
	{
		return first.length() + middle.length() + last.length();
	}
}
