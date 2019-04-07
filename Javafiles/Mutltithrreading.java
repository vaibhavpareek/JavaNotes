interface Test
{
  boolean isOK(int a);
}
class Lambda{

void process(Test ob,int x)
{ 
  if(ob.isOK(x)) System.out.println("OK");
  else System.out.println("Not accepted");
}
  public static void main(String []vp)
  {
  	
    Lambda ob = new Lambda();
    ob.process(x -> x%2==1,200);
    Test obj = x -> x>100;
    ob.process(obj,120);
    obj.isOK(250);
    if(obj.isOK(115))
      System.out.println("true");
      
   
  }

}