import java.util.Scanner;
class Program2{

	public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
System.out.print(1+", ");
for(int i=2; i<=num/2; i++)
{
if(num%i == 0 )
System.out.print(i+", ");
}
System.out.print(num);
}	
}