class Outer
{
	int x=10;
	static int y=20;
   static class StInner{
     
     				void show()
     					{
     					System.out.println("Show in static");
     					}

						}
	class Inner{

					void show()
						{
						System.out.println("Show in non static");
						}
		}

	class S{
      				 void demo()
     				  {
      			 	 class Dem{
       						 	void rm()
       								 	{
       							 		
       							 		System.out.println("In local class in demo function");
       	 								
       	 								}
       	 						

   					    	 }
   					   
   					   System.out.println("hello demo");

   					   Dem ob = new Dem();
   					   ob.rm();
      				    }
		
			}
}
class NestedDemo
{

	void allow()
	{
		System.out.println("NestedDemo");
	}
	public static void main(String []vp)
	{
		NestedDemo o1 = new NestedDemo();
		Outer ob = new Outer();
		Outer.StInner o3 = new Outer.StInner();
		o3.show();
		Outer.Inner o2 = ob.new Inner();
		o2.show();
        Outer.S o4 = ob.new S();
        o4.demo();
		
	}
}
