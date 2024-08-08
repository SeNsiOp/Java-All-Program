import java.util.Scanner;

public class ArrayInt {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
         System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.println("Enter Elements of Array");
        for(int i=0; i<a.length;i++){
           a[i]=sc.nextInt();
        }
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}