import java.util.Scanner;
public class PrimeS {
    public static boolean prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter A Number the Range is 10-100");
        int n = sc.nextInt();
        int start = 10;
        int end = 100;
        for(int i=start; i<=end; i++){
            boolean res= prime(i);

            if(res){
                System.out.println(i);
            }
        }
    }
}

