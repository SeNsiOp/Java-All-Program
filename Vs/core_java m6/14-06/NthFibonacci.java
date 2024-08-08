import java.util.Scanner;
class NthFibonacci{
	public static void fibS(int n){
		int n1=0,n2=1,n3=0,i=1,x=0;
		while(i<=n){
			x=n1;
			n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
			}
		System.out.println(x);
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth Number");
		int n = sc.nextInt();
		fibS(n);
	}
}