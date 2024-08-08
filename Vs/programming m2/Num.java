import java.util.Scanner;
public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int a = sc.nextInt();
        if(a%6==0){
            System.out.println("Divisible by 6");
        }
        else{
            System.out.println("not divisible by 6");
        }
    }
}
