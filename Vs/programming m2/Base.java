import java.util.Scanner;
public class Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Percentage");
        int a = sc.nextInt();
        if(a>=75 && a<=100){
            System.out.println("Allowed");

        }
        else{
            System.out.println("Not Allowed");
        }
    }
}
