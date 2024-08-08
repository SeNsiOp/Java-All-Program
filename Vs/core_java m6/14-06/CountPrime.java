import java.util.Scanner;
class CountPrime{

	public static int prime(int n)
	{
		int count = 0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
			{
				count++;
			}
		}
		return count;
	
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int m=sc.nextInt();
		System.out.println("Enter Ending Number");
		int n=sc.nextInt();
		int numCount=0;
		for(int i=m;i<=n;i++){
	
			int count=prime(i);

			if(count==2)
			{
				numCount++;
			}
		}
		System.out.println(numCount);
	}
}