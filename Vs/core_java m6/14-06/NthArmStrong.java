import java.util.Scanner;
class NthArmStrong{
	public static int arm(int n)
	{
		int n1=n,n2=n, sum=0,count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		while(n1!=0)
		{
			int power = 1;
			int temp= n1%10;
			for(int i=1;i<=count;i++)
			{
				power=power*temp;
			}
			sum=sum+power;
			n1=n1/10;
		}
	return sum;
	}
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Starting Number");
		int m = sc.nextInt();
		System.out.println("Enter ending Number");
		int n = sc.nextInt();
		System.out.println("Enter Nth Number");
		int k = sc.nextInt();
		boolean flag=false;
		int numCount=0;

		for(int i=m;i<=n;i++)
		{
			int x= arm(i);
			if(i==x)
			{
				numCount++;
				if(k==numCount)
				{	
					System.out.println("Nth ArmStrong is: "+x);		
					flag=true;
					break;
				}
			}
		}
		if(flag==false)
		System.out.println("The Nth Number is not present in given Range");
	}
}