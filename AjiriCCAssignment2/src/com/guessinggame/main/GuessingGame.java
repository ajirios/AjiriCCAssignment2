package com.guessinggame.main;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame 

{
	public static void main(String[] args)
	
	{
		System.out.println("Welcome to the Guessing Game module.");	
		
		boolean integersMatch = false;
		int attemptCount = 0;
		int integerRandom = 0;
		int integerEntered = 0;
		Random random = new Random();
		Scanner scanner;
		
		integerRandom = random.nextInt(100) + 1;    //this picks between 1 inclusive and 100 inclusive
		
		System.out.println("Please pick a number between 1 and 100.");
		
		
		
		while (attemptCount < 5 && integersMatch == false)
			
		{
			scanner = new Scanner(System.in);
			integerEntered = Integer.parseInt(scanner.nextLine());
			
			
			
			if (integerEntered < 1)
				
			{
				System.out.println("Your guess is not between 1 and 100, please try again.");
				
			}
			
			else if (integerEntered > 100)
				
			{
				System.out.println("Your guess is not between 1 and 100, please try again.");
			}
			
			else
				
			{
				if (integerEntered == integerRandom)
				{
					System.out.println("You win!");
					scanner.close();
					integersMatch = true;
				}
				
				else if (integerEntered < integerRandom)
				{
					attemptCount++;

					if (attemptCount == 5)
					{
						scanner.close();
						break;
					}
					
					System.out.println("Please pick a higher number.");
				}
				
				else
				{
					attemptCount++;

					if (attemptCount == 5)
					{
						scanner.close();
						break;
					}
					
					System.out.println("Please pick a lower number.");
					
				}
			}
			
			
			
		}
		
		
		
		
		
		if (integersMatch == false)
			
		{
			System.out.println("You lose!\n"
					+ "\n"
					+ "The number to guess was: " + integerRandom);
		}
		
	}

}
