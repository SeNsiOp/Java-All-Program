import java.util.Scanner;
class CheckPelindrome
{
	public static int pelind(int n)
	{
		int n1 = n;	
		int rev = 0;
		while(n!=0)
		{
			int temp=n%10;
			rev= (rev*10)+temp;
			n=n/10;
		}
		return rev;
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		int a = sc.nextInt();
		int b = pelind(a);
		if(b==a)
		{
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not A Palindrome NUmber");}

	}
}