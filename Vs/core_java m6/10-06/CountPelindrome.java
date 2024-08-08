	import java.util.Scanner;
	public class CountPelindrome 
	{
           public static void main(String[] args) 
	   {
            Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting Number: ");
           	int m= sc.nextInt();
		System.out.print("Enter Ending Number: ");
           	int n= sc.nextInt();
		int count=0;
          	for(int i=m;i<=n;i++)
		{
			int n1=i;
			int rev=0;
            		while(n1!=0)
			{
                		int temp =n1%10;
                		rev=(rev*10)+temp;
                		n1=n1/10;
            		}
            		if(i==rev)
                	count++;
		}
		System.out.println(count);
            
    
          } 
    	}
