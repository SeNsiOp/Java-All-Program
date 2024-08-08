import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of An Array");
        int n = sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int k=0;
        for(int i=0; i<a.length;i++){
            System.out.println("Enter Array A "+i+ " of element");
            a[i]=sc.nextInt();
        }
        for(int i=0; i<b.length;i++){
            System.out.println("Enter Array B "+i+ " of element");
            b[i]=sc.nextInt();
        }
        System.out.println("Array A is");
        for(int i=0; i<a.length;i++){
           System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Array B is");
        for(int i=0; i<b.length;i++){
          System.out.print(b[i]+" ");
        }
        
        int c[]=new int[a.length+b.length];
        for(int i=0; i<a.length;i++){
          c[k++]=a[i];
        }
        for(int i=0; i<a.length;i++){
          c[k++]=b[i];
        }
        System.out.println();
        System.out.println("New Array is this");
        for(int i=0;i<(a.length+b.length);i++){
            System.out.print(c[i]+" ");
        }
        
        
    }
}
