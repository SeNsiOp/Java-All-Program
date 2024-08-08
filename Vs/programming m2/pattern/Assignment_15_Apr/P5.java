import java.util.Scanner;

public class P5 {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n= sc.nextInt();
        System.out.println("Enter K th Number");
        int k=sc.nextInt();
        int count=0;
        for(int i=1; i<=n;i++){
        boolean res = prime(i);
        if(res){
            count++;
            if(count==k){
                System.out.println("Prime Number is of given number K th value " +i);
                break;
            }
        }
    }
}
}

