import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente Length of Array");
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<a.length;i++){
            System.out.println("Enter "+i+" element");
            a[i]=sc.nextInt();
        }
        System.out.println("Actual Array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int start = 0;
        int end = a.length-1;
        while (start<=end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;            
        }
        System.out.println();
        System.out.println("Reversed Array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
