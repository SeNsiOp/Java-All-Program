import java.util.Scanner;
class CountArmstrong
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a Starting Number: ");
int n= sc.nextInt();
System.out.print("Enter A Ending Number: ");
int m = sc.nextInt();
int numCount=0;
for(int i=n; i<=m;i++){
int n1=i,n2=i, n3=i, sum=0,count=0;
while(n1!=0)
{
count++;
n1=n1/10;
}

while(n2!=0)
{
int power =1;
int temp = n2%10;
for(int j=1;j<=count;j++)
{
power = power*temp;
}

sum=sum+power;
n2=n2/10;
}

if(sum==n3)
{
numCount++;
}
}
System.out.println(numCount);
}
}