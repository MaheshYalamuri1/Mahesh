class A 
{
	static int i=test();
	static
	{
		System.out.println("z12.SIB:"+i);
		i=99;
		main(null);
		System.out.println("z12.SIB again:"+i);
		i=10;
	}
	public static int test()
	{
	System.out.println("test:"+i);
	i=40;
	main(null);
	System.out.println("test again:"+i);
	return 75;
	}
	public static void main(String[] args) 
	{
		System.out.println("mainbegin:"+i);
		i=33;
		System.out.println("mainend:"+i);
	}
}