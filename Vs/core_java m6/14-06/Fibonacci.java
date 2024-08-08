
class InFibonacci{
	public static void fibS(){
		int n1=0,n2=1,n3=0;
		while(true){
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
			}
	}
	public static void main(String [] args){
		fibS();
	}
}