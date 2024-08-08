import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size");
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<a.length; i++){
            System.out.println("Enter "+ i + " elements ");
            a[i]=sc.nextInt();

        }
        for(int i =0;i<a.length;i++){
            sum= sum+a[i];


        }
        System.out.println("Sum is "+ sum);

    }
}
