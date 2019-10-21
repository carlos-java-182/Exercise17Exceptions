package com.Exercise17Exceptions.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class myExceptions {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int number1=0;
		
		
		Scanner input = new Scanner(System.in);
		try
		{
			
			System.out.println("Element is 0 "+numbers[0]);
			System.out.println("Element is 1 "+numbers[1]);
			System.out.println("Element is 2 "+numbers[2]);
			System.out.println("Element is 3 "+numbers[3]);
			System.out.println("Element is 4 "+numbers[4]);
			System.out.println("Element is 5 "+numbers[5]);
			System.out.println("Element is 6 "+numbers[6]);
			System.out.println("Element is 7 "+numbers[7]);
			System.out.println("Element is 8 "+numbers[8]);
			System.out.println("Element is 9 "+numbers[9]);
			//System.out.println("Element is 10 "+numbers[10]);
			System.out.println("Element is 0 "+numbers[0]);
			System.out.println("Element is 1 "+numbers[1]);
			System.out.println("Element is 2 "+numbers[2]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Hey, be careful. You are not directing to a valid index");
		}
		
		
		finally 
		{
			System.out.println("This finally statement wil be executed anyway");
		}	
		
		for(int i=0; i<4;i++)
		{
			try
			{
				System.out.println("Input a number between 0-10: ");
				numbers[i] = input.nextInt();
			}
			catch (NumberFormatException e)
			{
				System.out.println("Hey, the number you input is wrong. Do it again!!");
				input.next();
			}
			
			catch (InputMismatchException e)
			{
				System.out.println("Hey, the number you input is wrong. Do it again!!");
				input.next();
			}
		}
		

	}

}
