class NewProg
{
static int a;

public void print(){
	a= 5;
}

public static void main(String[] args){
NewProg n =new NewProg();
n.print();
System.out.println(n.a);
}
}