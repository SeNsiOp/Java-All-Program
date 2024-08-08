import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[a.length];
        
        for(int i=0;i<a.length;i++){
            System.out.print("Enter elements: "+i+" th number");
            a[i] = sc.nextInt();
        }
        int c=0;
        for(int i=0; i<a.length-1;i++){
            for(int j= i+1; j<a.length;j++){
                if(a[i]==a[j]){
                    b[i] = a[j];
                    a[j]= a[j]/10;
                    c++;
    
                }
            }
        }
        System.out.println("Output of A "); 
        for(int i=0;i<b.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("Output of B "); 
        for(int i=0;i<c;i++){
            System.out.println(b[i]);
        }
        
    }
}
