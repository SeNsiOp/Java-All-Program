import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Row Number");
       int n= sc.nextInt();
    //    System.out.println("Enter Column Number");
    //    int m= sc.nextInt();

        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==j||i == n)
                System.out.print("* ");
                else
                System.out.print("  ");

            }
            System.out.println();
        }
    }
}
