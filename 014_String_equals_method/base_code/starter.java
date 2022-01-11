import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		 Scanner sc=new Scanner(System.in);
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
	
	}
}
