import java.util.Scanner;

class array1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of An Array");
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<a.length;i++){
            System.out.println("Enter "+i+ " of element");
            a[i]=sc.nextInt();
        }
        int b[]=new int[a.length];
        for(int i=0;i<b.length;i++){
            b[i]=a[i];
        }
        System.out.println("Old Array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("New Array");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

        
    }
}