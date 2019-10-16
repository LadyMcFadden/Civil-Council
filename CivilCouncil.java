import java.util.Scanner;	// Needed for the Scanner class

/************************************************************************
*																		*
*	This program intended to determine the ages of all people living	*
*	in a given street.													*
*																		*
************************************************************************/

public class CivilCouncil
{
	public static void main (String[] args)
	{
		
		//Create a Scanner object to read input.
		Scanner keyboard = new Scanner (System.in);
		
		
		//----------Declare the variables-------------------------------------------------
		int amountOfHouses, houseNumber, age;
		
		
		//----------Declare the arrays----------------------------------------------------
		int[] numOfHouses;
		int[][] peoplePerHouse;
		int totalSum = 0;
		int partialSum;
  
		//Prompt the user for the amount of houses in the street and store the value into the rows
		//of the given array.
		System.out.print("How many houses in the street?\t: ");
		amountOfHouses = keyboard.nextInt();
		System.out.println();
		
		//Save the input into the rows of the array.
		numOfHouses = new int [amountOfHouses];
		
		//Use a for loop to fill in the columns of the rows of the array.
        for (int house = 0; house < numOfHouses.length; house++) 
		{
            System.out.print("What is the next house number?\t: ");
			
            houseNumber = keyboard.nextInt();
			
            numOfHouses[house] = houseNumber;
			
		}

		//Create multidimensional array to store the number of people living in each house.
		peoplePerHouse = new int [amountOfHouses][];
		
		for (int eachHouseIndex = 0; eachHouseIndex < peoplePerHouse.length; eachHouseIndex++)
		{
			int numOfPeople;
			
			//Skip a line.
			System.out.println();
		
			System.out.print("How many people live in number " + numOfHouses[eachHouseIndex] + ": ");
			numOfPeople = keyboard.nextInt();
			peoplePerHouse[eachHouseIndex] = new int [numOfPeople];
			
			for (int agePerPerson =0; agePerPerson < peoplePerHouse[eachHouseIndex].length; agePerPerson++)
			{
				System.out.print("What is the age of person " + (agePerPerson + 1) + "\t: ");
				age = keyboard.nextInt();
			    peoplePerHouse[eachHouseIndex][agePerPerson] = age;
				
			}
		
		}
		//Skip a line.
		System.out.println();
		
		//This is the outer and inner loop used to calculate the total age of everyone in the given street.
		for (int eachHouseIndex = 0; eachHouseIndex < peoplePerHouse.length; eachHouseIndex++)
		{
			partialSum = 0;
			
			for (int agePerPerson =0; agePerPerson < peoplePerHouse[eachHouseIndex].length; agePerPerson++)
			{
				partialSum = partialSum + peoplePerHouse[eachHouseIndex][agePerPerson];
				
			}
			totalSum += partialSum;
			System.out.println("House " + (eachHouseIndex + 1) + " has a total age of " + partialSum);
			
		}
		System.out.println();
		System.out.println("The street has  a total age of " + totalSum);
	}
}