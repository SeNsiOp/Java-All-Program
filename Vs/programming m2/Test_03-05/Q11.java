import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        // int n=sc.nextInt();
        int k=sc.nextInt();
        int n1=0;
        int n2=1;
        int n3=0;
        while (k>0) {
            k=n1;
            n3=n1+n2;
            n1=n2;
            n2=n3;

        }
        System.out.println(k);
    }
}
