import java.util.Scanner;
class Fahrenheit{

public static void main(String [] args){

double max_temp = 80.0, min_temp=70.0;
Scanner sc=new Scanner(System.in);
double cur_temp= sc.nextDouble();

cur_temp =cur_temp*(9.0/5)+32;
System.out.println(cur_temp);
if(cur_temp>=70 && cur_temp <=80)
{


System.out.println("Temprature is within the range");
}
}
}