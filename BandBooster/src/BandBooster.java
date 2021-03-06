/***
 * 
 * @author Vivian
 *
 */
public class BandBooster 
{
	private String name;
	private int boxesSold;
	
	/**Constructor for Band Booster**/
	public BandBooster(String bName)
	{
		name = bName;
		boxesSold = 0;
	}
	
	/**Returns name of a band booster**/
	public String getName()
	{
		return name;
	}
	
	/**Updates boxes sold**/
	public void updateSales(int boxes)
	{
		boxesSold += boxes;
	}
	
	/**Returns name and boxes sold of a band booster**/
	public String toString()
	{
		return String.format("%s: %d boxes", name, boxesSold);
	}
}
