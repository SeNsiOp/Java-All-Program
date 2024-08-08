import java.util.Scanner;
class Palindrome{

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
		System.out.println("Enter A Number");
		int n=sc.nextInt();
		int x= palindromeNumber(n);
		if(n==x)
		{
			System.out.println("Palindrome");
		}
		else
		System.out.println("Not Palindrome");
	}
}

		