/*
 * @ author: Vivian Fang, period 1
 *   rev: 11/19/2014
 *   Square.java
 */
import java.awt.*;
import java.util.Random;
public class Square
{
	/**Parameters of square**/
	private int x;
	private int y;
	private int length;
	private int c1, c2, c3; //three bits for R, G, B color
	
	/**Random number generator**/
	private static Random generator = new Random();
	
	/**Constructor - sets random parameters for fillRect() in a given range**/
	public Square()
	{
		x = generator.nextInt(601); 			//0 to 600
		y = generator.nextInt(401); 			//0 to 400
		length = generator.nextInt(101) + 100; 	//100 to 200
		c1 = generator.nextInt(256); 			//0 to 255
		c2 = generator.nextInt(256);
		c3 = generator.nextInt(256);	
	}
	
	/**Paints a square based on parameters in Square()**/
	public void paint(Graphics page)
	{
		page.setColor(new Color(c1, c2, c3));
		page.fillRect(x, y, length, length);
	}
}