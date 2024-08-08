import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary");
        int sal= sc.nextInt();
        System.out.println("Enter Experience Year");
        int exp = sc.nextInt();
        if(exp>5){
            int b= (sal*exp)/100;
            System.out.println(b+" Bonus");
        }
        else{
            System.out.println("NO Bonus");
        }
    }
}
