import java.util.Scanner;
class RangeFibonacci{
	public static void fibS(int n){
		int n1=0,n2=1,n3=0;
		for(int i=1;i<=n;i++){
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
			}
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range");
		int n = sc.nextInt();
		fibS(n);
	}
}