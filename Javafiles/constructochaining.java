class A{
	A()
	{   this("Professional");
		System.out.println("Lovely");
	}
	A(int x)
	{   this();
		System.out.println("University");
	}
	A(String x)
	{   
		System.out.println(x);
	}
}
class B extends A{
	B()
	{
		super(10);
		System.out.println("in B");
	}
	public static void main(String []vp)
	{
		B b1 = new B();
	}
}