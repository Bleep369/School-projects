//Sarah Wong
//Create the dog class and test the dog class using an array of dogs.
//DogTracker

import java.util.Scanner;

class Dog
{
	// Declare variables describing a dog.
	private String name;
	private int age;
	private int weight;
	private int numBarks;
	
	//Constructor: all variables recieved from main.
	public Dog(String incName, int incAge, int incWei, int incBark)
	{
		name= incName;
		age=incAge;
		numBarks=incBark;
		weight=incWei;
		
	}
	
	//Return name
	public String getName()
	{
		return name;
	}
	
	//Return age
	public int getAge()
	{
		return age;
	}
	
	//Return weight
	public int getWeight()
	{
		return weight;
	}
	
		
	public int compareTo(Dog incDog)
	{
		if (incDog.getWeight()==weight&&incDog.getAge()==age&&name.compareTo(incDog.getName())==0)
		{
			return 0;
		}
		if (incDog.getWeight()>weight||incDog.getAge()>age||name.compareTo(incDog.getName())>0)
		{
			return -1;
		}
		
		if (incDog.getWeight()<weight||incDog.getAge()<age||name.compareTo(incDog.getName())<0)
		{
			return 1;
		}
		
		return -2;
	}
	
	//Return a string of barks. Number of barks specified by numBarks.
	public String getBarks()
	{
		String bark="";
		
		
		for(int i=0; i<numBarks; i++)
		{
			bark=bark+"bark ";
		}
		
		return bark;
	}
	
}

public class DogCompare
{
	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		
		int choice=0;//Variable for option
		Dog[] dogArray= new Dog[5];//Array of dogs
		
		//Main varaiables that correspond to private variables in the Dog class
		String mName;
		int mAge, mWei, mBark;
		
		int foundDog=10;
		boolean found=false;
		
		//Dog
		Dog inputDog;
		Dog inputDog2;
		Dog search;
		
		while(choice<5)
		{
			//Menu
			System.out.println("Enter the number corresponding to the action you want to preform.\n");
			System.out.println("1: enter initial dog data");
			System.out.println("2: find dog");
			System.out.println("3: add new dog");
			System.out.println("4: delete existing dog");
			System.out. println("5: Quit");
			
			choice= reader.nextInt();
			
			//Prompt the user for and read in all the dog's information.
			if(choice==1)
			{
				for(int i=0; i<5; i++)
				{
					System.out.println("\nEnter the name of the dog.");
					reader.nextLine();
					mName=reader.nextLine();
					
					System.out.println("Enter the age of the dog.");
					mAge=reader.nextInt();
					
					System.out.println("Enter the weight of the dog in pounds.");
					mWei=reader.nextInt();
					
					System.out.println("Enter the number of barks.");
					mBark=reader.nextInt();
					
					 inputDog=new Dog(mName, mAge, mWei, mBark);
						
					dogArray[i]= inputDog;
				}
			}
			
			//Prompt the user for a name and search for that dog.
			if(choice==2)
			{
				/*System.out.println("Enter the name of the dog you would like to find.");
				reader.nextLine();
				mName=reader.nextLine();
				
				for(int i=0; i<5; i++)
				{
					//Output the dog's information.
					if(dogArray[i]!=null && mName.equalsIgnoreCase(dogArray[i].getName()))
					{
						System.out.println("Your dog was found :)");
						System.out.println("Name: " + mName + "\nAge: " + dogArray[i].getAge() + "\nweight: " + dogArray[i].getWeight() + "\n" + dogArray[i].getBarks());
						i=5;
					}
					
					//If dog not found inform the user.
					if(dogArray[4]!=null && !(mName.equalsIgnoreCase(dogArray[4].getName()))&& i==4)
					{
						System.out.println("\nSorry your dog was not found.\n");
					}
				}*/
				
					System.out.println("\nEnter the name of the dog you are searching for.");
					reader.nextLine();
					mName=reader.nextLine();
					
					System.out.println("Enter the age of the dog you are searching for.");
					mAge=reader.nextInt();
					
					System.out.println("Enter the weight of the dog in pounds you are searching for.");
					mWei=reader.nextInt();
					
					 search=new Dog(mName, mAge, mWei, 0);
					 
					 for(Dog i: dogArray)
					 {
					 	foundDog=i.compareTo(search);
					 	index++;
					 	if(foundDog==0)
					 	{
					 		System.out.println("Your dog was found:)");
					 		found==true;
					 	}
					 
					 }
						
				
				
				
			}
			
			//Search for an empty space and inalize it to a new dog.
			if (choice==3)
			{
				for(int i=0; i<5; i++)
				{
					//Prompt the user for dog's name, weight, age and barks.
					if(dogArray[i]== null)
					{
					System.out.println("Enter the name of the dog.");
					reader.nextLine();
					mName=reader.nextLine();
					
					System.out.println("Enter the age of the dog.");
					mAge=reader.nextInt();
					
					System.out.println("Enter the weight of the dog in pounds.");
					mWei=reader.nextInt();
					
					System.out.println("Enter the number of barks.");
					mBark=reader.nextInt();
					
					inputDog2=new Dog(mName, mAge, mWei, mBark);
						
					dogArray[i]= inputDog2; 
					
					i=5;
					}
					
					//If no null spaces, inform the user that this action cannot be performed.
					if(dogArray[4]!=null && i==4)
					{
						System.out.println("\nSorry, we don't have room for another dog.\n");
					}
					
				}
				
			}
			
			// Prompt the user for a name. Search for that name. 
			if(choice==4)
			{
				System.out.println("Enter the name of the dog you want to delete.");
				reader.nextLine();
				mName=reader.nextLine();
					
				for(int i=0; i<5; i++)
				{
					//When dog is found set the dog equal to null.
					if( dogArray[i]!=null && mName.equalsIgnoreCase(dogArray[i].getName()))
					{
						dogArray[i]=null;
						i=5;
					}
					
					//If dog is not found, inform the user.
					if(dogArray[4]!=null && !(mName.equalsIgnoreCase(dogArray[4].getName()))&& i==4)
					{
						System.out.println("\nSorry your dog was not found.\n");
					}
				}
			}
		}
	}

}