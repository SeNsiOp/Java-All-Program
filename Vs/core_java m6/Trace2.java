class Trace2
{
	static int x;
	static int y= 10;
	static int z= add();
	public void m2()
	{
		System.out.println("m2");
	}
	public static void main(String [] args)
	{
		System.out.println("hello world");
		m1();
		System.out.println("Bye");
		m1();
		System.out.println(z);
		int a = add();
		System.out.println(a);
	}
	public static void m1()
	{
		System.out.println("From m1");
		System.out.println(x+y);
	}
	public static int add()
	{
		System.out.println("addition");
		return 7;
	}
}