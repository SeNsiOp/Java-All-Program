import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
             System.out.println("Enter Size of Array");
            int n=sc.nextInt();
            String a[]=new String[n];
            
            System.out.println("Enter Elements of Array");
            for(int i=0; i<a.length;i++){
               a[i]=sc.next();
            }
            for(int i=0; i<a.length;i++){
                System.out.print(a[i]+" ");
            }
        }
}
