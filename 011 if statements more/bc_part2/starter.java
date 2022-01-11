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
	System.out.println("Please input a third number.");
	int C=sc.nextInt();
	
	boolean x=(A > B);
	boolean x2=(A > C);
	boolean y=(B > A );
	boolean y2=(B > C);
	boolean z=(C > B);
	boolean z2=(C > A);
	
	
	if(x){
		System.out.println("The greatest number is "+A);
	}
	if(y){
		System.out.println("The greatest number is "+B);
	if(z){
		System.out.println("The greatest number is "+C);
		
		boolean e=(A < B);
		boolean e2=(A < C);
		boolean f= (B < A);
		boolean f2=(B < C);
		boolean g=(C < A);
		boolean g2=(C < B);
		if(e){
			System.out.println("The lowest number is "+A);
	
		}
		if(f){
			System.out.println("the lowest number is "+B);
	
		}
		if(g){
			System.out.println("The lowest number is "+C);
		}
	}
	}
	}
	}
	
	
	
	
	

	
	