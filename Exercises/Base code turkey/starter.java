import java.util.Scanner; 
class starter {
	public static void main(String args[]) {
		// the strin g "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc=new Scanner(System.in);
int x= sc.nextInt(); 
int ans=x - 1;

while(true)
{
	System.out.println(x);
	x= x*ans;
	if(ans==0);
	{
		break;
	}
	ans=ans-1;
}
	}
}
