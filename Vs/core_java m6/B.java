class B
{
	static int i;
	static
	{
		i=9;
	}

	public static void main(String [] args)
	{
		System.out.println(A.a);
		i=9;
	}
}