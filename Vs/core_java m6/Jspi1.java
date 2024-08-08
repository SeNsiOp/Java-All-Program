class Jspi1
{
	int a = 10;
	int b;
	static int d;
	static
	{
		System.out.println(d);
		d=5;
		System.out.println("value updated");
	}
	
	static int c=30;
		
	public static void add()
	{
		System.out.println("Adding");
	}

	public void sub()
	{
		System.out.println("Sub");
	}

	{
		System.out.println("NSMLI");
	}

	public static void main(String [] args )
	{
		System.out.println("I am main()");
		System.out.println(c);
		System.out.println(d);
		add();
	}

	static
	{
		System.out.println("SMLI");
	}
	
	static
	{
		System.out.println("SMLI2");
	}
}