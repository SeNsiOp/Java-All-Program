import java.util.Scanner;
class Program3{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
// read num
int num = sc.nextInt();
// count factors 
int count = 2; // 1 & num itself is a factor

for(int i=2; i<=num/2 ; i++)
{
if(num%i==0)
count++;
}
if(count==2){
System.out.println("Prime No.");
}
else
System.out.println(" Not Prime No.");
}
}