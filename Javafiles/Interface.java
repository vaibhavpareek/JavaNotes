abstract class A{
	
	abstract public int add(int a,int b);
    int a = 10;
    
}
interface X
{
	int a = 20;
   void test();
   default void demo()
   {
   	System.out.println("demo in x");
   }
   static void show(){
   	System.out.println("Show in x");
   }
}
interface Y
{
	int a= 30;
	void test();
	default void demo()
	{
        System.out.println("Demo in y");
	}
}
class Z extends A implements X,Y
{
      public void test()
      {
      	System.out.println("Test in Z");

      }

      public void demo()
      {
          X.super.demo();
          Y.super.demo();

          System.out.println(X.a);
			System.out.println(Y.a);
         System.out.println(super.a);
        // System.out.println(A.x);   
      }
     public int add(int a,int b)
     {
     	System.out.println("ADD calls");
     	return 0;
     }
    public static void main(String []vp)
    {
    	Z ob = new Z();
           ob.demo();
           ob.test();
           ob.add(5,4);
       X.show();

    }

}