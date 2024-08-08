import java.util.Scanner;
class ArmStrong{
public static void main(String [] args){
Scanner sc =new Scanner(System.in);
int n = sc.nextInt();
int n1=n,n2=n,sum=0,count=0;
while(n!=0){
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

if(n2==sum)
{
System.out.println("Armstrong");
}
else
System.out.println("Not Armstrong");
}
}