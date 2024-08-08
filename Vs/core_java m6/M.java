class M
{
	static int p;
	int a;
	int b=5;
	static int q= 67;
	
	{
		System.out.println("MLSI");
	}
	public void m1()
	{
		System.out.println("m1() method");
	}
	
	static
	{
		System.out.println("MLSI");
	}
	public static void m2()
	{
		System.out.println("m2() method");
	}
	public static void main(String [] args)
	{
		int p = 90;
		//System.out.println(a);
		m2();
		System.out.println(M.p);
		System.out.println(p);
	}
}