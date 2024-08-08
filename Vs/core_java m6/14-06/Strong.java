import java.util.Scanner;
class Strong{
	public static int fact(int n){
		int f=1;
		for(int i=1;i<=n;i++){
			f=f*i;
		}
	return f;
	}
	public static int strongNumber(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rev=n%10;
			sum=sum+fact(rev);
			n=n/10;
		}
		return sum;
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int n=sc.nextInt();
		int x= strongNumber(n);
		if(n==x)
		{
			System.out.println("Strong Number");
		}
		else
		System.out.println("Not Strong Number");
	}
}

		