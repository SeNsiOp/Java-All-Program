import java.util.Scanner;

public class F1 {
public static void num(int n){
    int num = n;
    if(num%2==0){
        System.out.println(num+" is Even");
        // return ("Even"); 
    }
    else{
        System.out.println(num+" is Odd");
        // return ("Odd");
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A Number: ");
    int n = sc.nextInt();
        num(n);
    }
}
