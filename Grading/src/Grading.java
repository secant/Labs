/**
 * Grading.java
 * Author: Vivian Fang, period 1
 * This program allows the user to input a key and a string of integers
 * (presumably from a quiz) to grade (referencing the original key). 
 * Returns the percentage of the correct answers / total questions.
 */

import java.util.Scanner;
public class Grading 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int i = 0; //variable that holds the amount of answers
		int inCount = 0; //keeps track of answers that are inputted
		int correct = 0;  //keeps track of correct answers
		boolean loop = true; //to keep repeating the correction of answers
		System.out.println("How many answers to this key are there?");
		i = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter the answers, separated by a space.");
		String input = scan.nextLine();
		String[] numberConvert = input.split(" ");
		
		int[] key = new int[i];
		for(int q = 0; q < i; q++)
		{
			key[q] = Integer.parseInt(numberConvert[q]);
		}
		
		while(loop)
		{
			System.out.println("Please enter the student's responses, separated by a space.");
			while(inCount < i)
			{
				if(scan.nextInt() == key[inCount])
				{
					correct ++;
				}
				inCount++;
			}
			scan.nextLine();
			System.out.println("Number correct: " + correct);
			System.out.printf("Percent correct: %.2f%%\n", ((double) correct / i * 100));
			System.out.println("Grade another quiz? (y/n)");
			if(scan.next().equalsIgnoreCase("y"))
			{
				loop = true;
			}
			else
			{
				loop = false;
				System.out.println("Closing program.");
			}
			inCount = 0;
			correct = 0;
		}
	}
}

