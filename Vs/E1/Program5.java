import java.util.Scanner;

class Program5{
	public static void main(String[] args){

Scanner sc = new Scanner(System.in);
//read inputs
int age = sc.nextInt();
double totalPrice = sc.nextDouble();
double priceAfterDisc = totalPrice;

//lets apply discount

if(age>=13 && age<= 19){
	//apply 5% discount
	priceAfterDisc = totalPrice - (totalPrice*0.05);
// s2: apply another 5% if after disc price > 5000
if(priceAfterDisc>5000){
priceAfterDisc = priceAfterDisc-(priceAfterDisc*0.05);
}//end of inner if
}// end of outer if

else if(age>=20 && age<=29){
//s1: apply flat 6% disc
priceAfterDisc = totalPrice - (totalPrice*0.06);
//s2: check new price is greater than 4000

if(priceAfterDisc > 4000)
{
priceAfterDisc = priceAfterDisc - (priceAfterDisc *0.06);
}//end of inner if
}//end of outer else if
else if(age>29)
{
//s1: apply flat 15% disc
priceAfterDisc = totalPrice -(totalPrice*0.15);

}// end of else if

// display the outputs
// 1---> total Price
System.out.println(totalPrice);
// 2---> total Price After Disc
System.out.println(priceAfterDisc);
// 3---> discounted price;
System.out.println(totalPrice-priceAfterDisc);


}
}