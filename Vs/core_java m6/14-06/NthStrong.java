import java.util.Scanner;
class NthStrong{
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
		System.out.println("Enter Starting Number");
		int m=sc.nextInt();
		System.out.println("Enter Starting Number");
		int n=sc.nextInt();
		System.out.println("Enter Nth Number");
		int k=sc.nextInt();
		int numCount=0;
		boolean flag=false;
		for(int i=m;i<=n;i++){
		
			int x= strongNumber(i);
			if(i==x)
			{
				numCount++;
				if(k==numCount){
					System.out.println(x);
					flag =true;
					break;
				}
			}
		}
		if(flag==false)
		System.out.println("The Nth number is not present in given range");
	}

}

		