import java.io.*;
class ProductAllDigits
{    
static int getProduct(int number)  
{  
int product =1;
	if(number != 0)
	{
	product = product * (number %10);
	number = number /10;
	}
return product;
}   
public static void main(String args[])  
{  
int number = 1234;
System.out.println(getProduct(number));  
}  
} 

