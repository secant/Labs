/*
 * @ author: Vivian Fang, period 1
 *   rev: 11/19/2014
 *   SquarePaint.java
 */
import java.applet.Applet;
import java.awt.*;
public class SquarePaint extends Applet
{
	public void paint(Graphics page)
	{
		/**Initialize squares**/
		Square square1 = new Square();
		Square square2 = new Square();
		Square square3 = new Square();
		Square square4 = new Square();
		Square square5 = new Square();
		
		/**Paint squares**/
		square1.paint(page);
		square2.paint(page);
		square3.paint(page);
		square4.paint(page);
		square5.paint(page);
	}
}
