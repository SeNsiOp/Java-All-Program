class Act4{
public static void main(String[] args){
double principalAmount = 800000;
int timeInMonths = 60;
double rateOfIntrest = 12;
double simpleIntrest = (principalAmount * timeInMonths * rateOfIntrest)/(100*12);
System.out.println("Simple Intrest: Rs. " + simpleIntrest);
}}