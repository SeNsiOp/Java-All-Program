class MarksCard{
public static void main(String[] args){
int marks= 88;
if(marks>90){
System.out.println("Grade A++");
}
else if(marks>75 && marks<=90){
System.out.println("Grade A");
}
else if(marks>60 && marks<=75){
System.out.println("Grade B");
}
else if(marks>50 && marks<=60){
System.out.println("Grade C");
}
else if(marks>35 && marks<=50){
System.out.println("Grade D");
}
else{
System.out.println("fail");
}
}}