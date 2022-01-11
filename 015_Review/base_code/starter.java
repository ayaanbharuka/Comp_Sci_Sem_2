import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.println("What is you name"); 
		String b=sc.nextLine();
		System.out.println("What title do you want ex: Slayer of Dragons");
		String c=sc.nextLine();
		 System.out.println("Would you like to be  wizard, warrior or rogue, please type your answer in lower cases");
		 String a=sc.nextLine();
		 boolean x=(a.equals("wizard"));
		 boolean y=(a.equals("warrior"));
		 boolean z=(a.equals("rogue"));
		 if(x)
		 {
		 System.out.println("You now need to train like a wizard!!");	
		 }
		else if(y)
		 {
		 System.out.println("You now need to train like a warrior!!");
		 }
		else if(z)
		 {
		 System.out.println("You now need to train like a rogue!!");
		 }
		 else{
		 System.out.println("You have not chosen an option, please choose an option");	
		 }
		 System.out.println("You have 25 skill points to spend in the following: Strength, dexterity, intelligence, constitution and charisma.  Spend them wisely");
		 System.out.println("Strength (1-10): ");
		 int e=sc.nextInt();
		 int points=25;
		if(e <= 10 && e >= 1)
		{
			System.out.println(); 
			points=25;
			System.out.println("You have" +points+"left to spend");
			System.out.println();
		}
		else 
		{
			System.out.println("your number is too high, you need to choose a number between 1 and 10"); 
			System.out.println("Strength(1-10)");
			e=sc.nextInt();
			if (e <= 10 && e>= 1)
			{
				System.out.println();
				points = points - e;
				System.out.println("You have "+points+"to spend");
				System.out.println();
			}
		}
		
		System.out.println("dexterity (1-10): "); 
		int dex=sc.nextInt(); 
	
	if ( dex <= 10 && dex >= 1)
	{
		System.out.println();
		points = points - dex; 
		System.out.println("You have "+points+"left to spend"); 
		System.out.println(); 
	}
else 
{
	System.out.println("You have not chosen the correct amount, choose another amount"); 
	System.out.println("dexterity(1-10)");
	dex=sc.nextInt();
	points = points - dex; 
	if (dex <= 10 && dex >= 1)
	{
		System.out.println();
		points = points - dex;
		System.out.println("You have "+points+"left to spend"); 
		System.out.println();
	}
}
System.out.println("intelligence (1-10): "); 
		int intel=sc.nextInt(); 
	
	if ( intel <= 10 && intel >= 1)
	{
		System.out.println();
		points = points - intel; 
		System.out.println("You have "+points+"left to spend"); 
		System.out.println(); 
	}
else 
{
	System.out.println("You have not chosen the correct amount, choose another amount"); 
	System.out.println("intelligence(1-10)");
	intel=sc.nextInt();
	points = points - intel; 
	if (intel <= 10 && intel >= 1)
	{
		System.out.println();
		points = points - intel;
		System.out.println("You have "+points+"left to spend"); 
		System.out.println();
	}
}
System.out.println("Constitution (1-10): "); 
		int cons=sc.nextInt(); 
	
	if ( cons <= 10 && cons >= 1)
	{
		System.out.println();
		points = points - cons; 
		System.out.println("You have "+points+"left to spend"); 
		System.out.println(); 
	}
else 
{
	System.out.println("You have not chosen the correct amount, choose another amount"); 
	System.out.println("cons(1-10)");
	cons=sc.nextInt();
	points = points - dex; 
	if (cons <= 10 && cons >= 1)
	{
		System.out.println();
		points = points - cons;
		System.out.println("You have "+points+"left to spend"); 
		System.out.println();
	}
}
System.out.println("Charisma (1-10): "); 
		int charisma=sc.nextInt(); 
	
	if ( charisma <= 10 && charisma >= 1)
	{
		System.out.println();
		points = points - charisma; 
		System.out.println("You have "+points+"left to spend"); 
		System.out.println(); 
	}
else 
{
	System.out.println("You have not chosen the correct amount, choose another amount"); 
	System.out.println("dexterity(1-10)");
	charisma=sc.nextInt();
	points = points - dex; 
	if (charisma <= 10 && charisma >= 1)
	{
		System.out.println();
		points = points - charisma;
		System.out.println("You have "+points+"left to spend"); 
		System.out.println();
	}
}
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println("--------------------------------------------------------------------------------------------------------------------");
System.out.println("You are "+b+", the "+c+"of CVHS. ");
System.out.println("You are a "+a+ "with the following attributes");
System.out.println("Strength- "+e+".");
System.out.println("Dexterity- "+dex+".");
System.out.println("Intelligence- "+intel+".");
System.out.println("constitution- "+cons+".");
System.out.println("charisma- "+charisma+".");
System.out.println();
System.out.println();
System.out.println();
System.out.println("Good luch on your quest "+b+"!!");
}
}