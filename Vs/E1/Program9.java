import java.util.Scanner;
class Program9{

public static void main(String [] args){

Scanner sc= new Scanner(System.in);
//step 1 read num
int num=sc.nextInt();
// step 2 preserve original

int originalNum=num;
// step 3 find m (length of m)
int count=0;
while(num!=0)
{
num/=10;
count++;
}// end of while loop
int m=count;

//step 4
num = originalNum;
int sum = 0;
while(num !=0)
{
// obtain d
int d = num %10 ; 
// calculate d^m;
int power =1;
for(int i=1; i<=m; i++)
{
power = power * d;
} // end of inner for loop

sum= sum + power;
//update num
num/=10;
} // end of while loop


// step 5 compare sum with original num
if(originalNum == sum)
System.out.println("It is Special");

else 
System.out.println("It is not special");
 
} //end of main
}

