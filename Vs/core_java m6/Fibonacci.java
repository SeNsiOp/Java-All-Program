import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=0;
        int n2=1;
        int n3=0;
	int i=1;
        int x= 0;
        while(i<=n){
            x=n1;
            n3=n1+n2;
            n1=n2;
            n2=n3;
            i++;
        }
        System.out.println(x);
    }
}