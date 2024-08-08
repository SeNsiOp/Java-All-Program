class Jspi
{
	int a= 10;
	int b;
	static int c= 30;
	static int d;
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
	public static void main(String [] args)
	{
		System.out.println("I am main()");
		System.out.println(c);	
		System.out.println(d);
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