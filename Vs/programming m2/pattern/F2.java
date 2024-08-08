import java.util.Scanner;

public class F2 {
public static int mul(int n,int m){
    int num = n;
    int num1 = m;
    return (num*num1);    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int n = sc.nextInt();
    System.out.print("Enter Second Number: ");
    int m = sc.nextInt();
        mul(n,m);
        System.out.println("Multiplication : "+ n*m);
    }
}
