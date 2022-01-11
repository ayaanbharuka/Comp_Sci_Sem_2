import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("Pick one number out of 1-1000");
		int A=sc.nextInt();
		int B=rand.nextInt(1000)+1;
		boolean x = (A < B);
		boolean y = (A > B);
		boolean z = (A==B);
		if(z)
		{
		System.out.println(A+" is equal to, the number is "+B);
		} 
		else if(y)
		{
			System.out.println("Your answer is larger than the number, the number is "+B);
		}
		else if(x)
		{
				System.out.println("Your answer is smaller than the number, the number is "+B);
		}
	}
}
