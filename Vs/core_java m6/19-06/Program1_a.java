import java.util.Scanner;
class Program1_a{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
char char1= sc.next().charAt(0);
char char2= sc.next().charAt(0);
if(char1<char2)
{
System.out.println(char1);
}
else
{
System.out.println(char2);
}
}
}