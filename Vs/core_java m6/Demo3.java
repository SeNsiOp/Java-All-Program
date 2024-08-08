class Demo3
{
	static int i;
	static int j;
	public static void main(String [] args)
	{
		System.out.println(i);
		int i = 20;
		m1();
		System.out.println(i);	//20;
		System.out.println(Demo.i);
		i=8;
		Demo.i =9;
	}
	public static void m2()
	{
		System.out.println(i);
	}
}