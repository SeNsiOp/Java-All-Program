import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length;i++){
            System.out.println("Enter Array "+i +"nt Elements");
            a[i]=sc.nextInt();
        }
        for(int i=0; i<a.length-1;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted In Descending Order");
                for(int i:a){
                    System.out.print(i+" ");
    }
    }
}
