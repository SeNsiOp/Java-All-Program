import java.util.Scanner;
class CPalindrome{

	public static int palindromeNumber(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int temp=n%10;
			rev=(rev*10)+temp;
			n=n/10;
		}
		return rev;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int m=sc.nextInt();
		System.out.println("Enter Ending Number");
		int n=sc.nextInt();
		int numCount=0;
		for(int i=m;i<=n;i++){
		
			int x= palindromeNumber(i);
			if(i==x)
			{
				numCount++;
			}
		}
		System.out.println(numCount);
	}
}

		