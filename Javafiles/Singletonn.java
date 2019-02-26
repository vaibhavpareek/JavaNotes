class B{
   static private B ob;
   private B()
   {
   	System.out.println("In B");
     }
   static public B getInstance()
   {  if(ob == null)
   	     ob = new B();
    return ob;
   }

}
class TestSinngleton 
{
	public static void main(String ...vp)
	{
		B ob1 = B.getInstance();
	    B ob2 = B.getInstance();
		B ob3 = B.getInstance();
			if(ob1 == ob3)
			{
				System.out.println("True");
			}
	}
}