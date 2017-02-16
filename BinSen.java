//Sarah Wong
//Create a program that allows the user to search an array of data in two different ways.
//BinSen

import java.util.Scanner;
class BinSen
{
	public static void main(String args[])
	{
		Scanner reader= new Scanner(System.in);
		
		int[] fifteen= new int[15];
		int random=(int)(Math.random()*10+1);
		int randcount=random;
		int index=0;
		int search;
		int comparison=0;
		
		
		for(int i=0; i<15; i++)
		{
			fifteen[i]=randcount;
			randcount+=random;
				
		}
		
		for(int i: fifteen)
		{
			System.out.println(index+": "+ fifteen[index]);
			index++;
		}
		
		
		System.out.println("Enter a number you want to seach for.");
		search=reader.nextInt();
		
		for(int i=0; i< 15; i++)
		{
			comparison++;
			if(fifteen[i]==search)
			{
				System.out.println("The number " + search + " was found at position" + i + ", after " + comparison + " comparisons.");
			}
		}
		
	}
}