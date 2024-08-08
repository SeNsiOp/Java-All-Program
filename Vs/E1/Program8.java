import java.util.Scanner;

class Program8{

public static void main(String [] args)
{

Scanner sc = new Scanner(System.in);

int num= sc.nextInt();
//assumption
int largestDigit= num%10;
num/=10;

//check if the assumption is correct for remaining digit
while(num!=0){
int digit = num%10;
// check whether assumption is correct

if(digit > largestDigit)
{
// assumption was wrong change largest digit
largestDigit = digit;
}
// update
num /=10;
} //end of loop
System.out.println(largestDigit);
}
} 


