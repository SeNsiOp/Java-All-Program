import java.util.Scanner;
class School{
public static void main(String [] args){

Scanner sc =new Scanner(System.in);
String day =sc.next();

switch(day){
case  "Monday":	
case "Wednesday" :{
System.out.println("Basket Ball");
		}break;

case "Tuesday":
case "Friday" :{
System.out.println("Basket Ball");
}
break;

case "Thursday": System.out.println("Cricket");
		break;

case "Saturday": System.out.println("Exercise");
		break;
case "Sunday": System.out.println("Holiday");
		break;
default:	
System.out.println("Invalid Input");


}
}
}