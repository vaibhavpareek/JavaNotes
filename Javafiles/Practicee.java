interface A{
	void demo();
	static void demost()
	{
       System.out.println("i am in demost of interface A");
	} 
	default void defdemo()
	{
		System.out.println("i am in defdemo of interface A");
	}

}
interface B{
		void demo();
	static void demost()
	{
       System.out.println("i am in demost of interface B");
	} 
	default void defdemo()
	{
		System.out.println("i am in defdemo of interface B");
	}	
}
class Learn implements A,B
{
	public void demo()
	{
		System.out.println("HEllo i am in demo");
	}
	public void defdemo()
	{
		A.super.defdemo();
		B.super.defdemo();
       System.out.println("HEllo i am in demost of class");
	}
	public static void main(String []vp)
	{
        Learn ob = new Learn();
        ob.demo();
        ob.defdemo();
        A.demost();
		B.demost();


	}
}