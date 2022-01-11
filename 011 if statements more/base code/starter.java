import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc=new Scanner(System.in);
	System.out.println("Please input 1 number");
	int A=sc.nextInt();
	System.out.println("Please input another number"); 
	int B=sc.nextInt();
	
	boolean x=(A > B);
	boolean y=(A < B);
	boolean z=(A==B);
	
	if (x){
		System.out.println("Your greater number is "+A);
	
		
	}
	if (y){
		System.out.println("Your greater number is "+B);
	
	}	
	if (z){
		System.out.println("Both numbers are equal");
	}

	}
	
}
