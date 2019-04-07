class Class1
{
 
static class Class2
{
   void dem1()
   {
      System.out.println("Hello i am in static class2");
   }
}
class Stclass
{
  void dem2()
  {
  	System.out.println("Hello i am in inneer Stclass ");
  }
}
void demo()
{
	class Lc
	{
         void pr()
         {
         	System.out.println("HEllo i am in LOcal block");
         }
	}
	Lc l = new Lc();
	l.pr();
}
  public static void main(String []vp)
  {
  	Class1.Class2 ob1 = new Class1.Class2();
  	ob1.dem1();
  	Class1 ob = new Class1();
  	Class1.Stclass ob2 = ob.new Stclass();
  	ob2.dem2(); 
    ob.demo();
  }
}