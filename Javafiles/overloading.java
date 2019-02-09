class Test
{
	void Test(byte b)
	{
      System.out.println("byte");
	}
	int Test(int a)
	{
		System.out.println("Int");return 0;
	}
	double Test(double d)
	{
		System.out.println("douuble");
	}
	public static void main(String ...rk)
	{
         Test obj = new Test();
         obj.Test(1);
	}
}