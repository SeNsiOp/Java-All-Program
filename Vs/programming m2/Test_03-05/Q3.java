import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number of size");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
            for(int j=i+1;j<n;j++){
                if(j==1){
                    System.out.print("* ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    }
}
