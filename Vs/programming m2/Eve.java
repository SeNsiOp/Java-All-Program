import java.util.Scanner;
public class Eve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
