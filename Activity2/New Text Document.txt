class SumAllDigits{    
static int findSum(int number)  
{  
return number == 0 ? 0 : number % 10 findSum(number/10) ;  
}  
public static void main(String args[])  
{  
int number = 12345;  
System.out.println("The sum of digits: "+findSum(number));  
}  
}  