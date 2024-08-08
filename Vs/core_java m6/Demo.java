class Demo
{
	static int a = 8;	// static variable // static single line initializer 
	int y=7; //non-static variable //non- static single line initializer

	static int roll; //static var
	int u;	// non static var

	// static method
	public static void m1()
	{
		System.out.println("m1");
	}

	// non static method
	public void m2()
	{
		System.out.println("m2");
	}

	public static void main(String[] args)
	{
		System.out.println("start");
		System.out.println(y);
	}

	// static multi line initializer 
	static 
	{
		System.out.println("static multi line initializer 1");
	}

	// non static multiline initializer

	{
		System.out.println("Non static multi line initializer");
	}


}