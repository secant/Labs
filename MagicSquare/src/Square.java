/**
 * Square.java
 * Author: Vivian Fang, pd. 1
 * Revised 02/15/15
 * 
 * Define a Square class with methods to create and read in
 * info for a square matrix and to compute the sum of a row,
 * a col, either diagonal, and whether it is magic.
 */

import java.util.Scanner;

public class Square
{
	private int side;
    int[][] square;

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
    	square = new int[size][size];
    	side = size;
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
    	int sum = 0;
    	for(int i = 0; i < side; i++)
    		sum += square[row][i];
    	return sum;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
    	int sum = 0;
    	for(int i = 0; i < side; i++)
    		sum += square[i][col];
    	return sum;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
    	int sum = 0;
    	for(int i = 0; i < side; i++)
    		sum += square[i][i];
    	return sum;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
    	int sum = 0;
    	for(int i = 0; i < side; i++)
    		sum += square[i][side - i - 1];
    	return sum;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
    	boolean isMagic = true;
    	if(sumMainDiag() == sumOtherDiag())
    	{
    		int sum = sumMainDiag();
	    	for (int i = 0; i < side; i++)
	    	{
	    		if(sumRow(i) != sum)
	    			isMagic = false;
	    		if(sumCol(i) != sum)
	    			isMagic = false;
	    	}
    	}
    	else
    		isMagic = false;
    	return isMagic;
    }

    //--------------------------------------
    //read info into the square from the input stream associated with the 
    //Scanner parameter
    //--------------------------------------
    public void readSquare(Scanner scan)
    {
      for (int row = 0; row < square.length; row++)
		  for (int col = 0; col < square.length; col ++)
		    square[row][col] = scan.nextInt();
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
    	for (int row = 0; row < side; row++)
    	{
    		for(int col = 0; col < side; col++)
    		{
    			System.out.print(square[row][col] + "\t");
    		}
    		System.out.println();
    	}
    }

}