import java.util.Scanner;

public class P7 {
    public static int digit(int n){
    int count=0;
    while (n!=0) {
    n = n/10;
    count++;
    }
    return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        System.out.println("The Count Of the Number is --> "+ digit(n));
    }
}