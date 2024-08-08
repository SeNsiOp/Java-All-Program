import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n= sc.nextInt();
        int a[] = new int[n];
        boolean res = false;
        for(int i=0;i<a.length;i++){
            System.out.print("Enter Array "+i+" th element: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Enter find number");
        int k = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                res = true;   
            }
        }
        if(res==true){
        System.out.println(k+" this element is present in this array");
        }
        else
        System.out.println(k+" not Present");
    }
}
