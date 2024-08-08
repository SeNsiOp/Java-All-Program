import java.util.Scanner;
public class OddWithoutMod {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A number to Check Even or odd");
    int n=sc.nextInt();
    boolean flag= true;
    for (int i = 0; i < n; i++) {
        flag= !flag;
    }
    if (flag) {
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
}
    
}