import java.util.*;
abstract class Invalid extends Throwable
{

}
class Demo extends Invalid 
{
	public static void main(String []vp)
	{
	try 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a == 5)
		{
			throw new Invalid();
		}
		else
		{
			System.out.println("print"+a);
		}
	}
	catch(Invalid v)
	{
		System.out.println("Invalid exception");
	}
	
	}
}