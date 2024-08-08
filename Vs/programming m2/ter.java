import java.util.Scanner;

public class ter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = sc.nextInt();
        System.out.println("Enter b value");
        int b = sc.nextInt();
        String result = (a>b?"A is Greater":"B is Greater");
        System.out.println(result);
    }
}
