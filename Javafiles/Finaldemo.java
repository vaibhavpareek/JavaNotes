class FinalDemo
{  int x = 10;
	void demo()
	{
		System.out.println("Parent");
	}
	Parent(int x)
	{
       x =100;
	}
}
class Child extends Parent{
	int x=20;
   void demo()
   {
   	System.out.println('child'+x);

   }
   child()
   {
   	x = 100;
   }
}

class FinalDemo{
	public static void main(String []vp)
	{
		Parent p = new Child();
		//p.demo();
		System.out.println(p.x);		
	}
}