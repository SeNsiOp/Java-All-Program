import java.util.Scanner;
public class D3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long f=1l;
        for(int i=1; i<=n;i++){
            f*=i;
        }
     System.out.println(f);   
    }
}
