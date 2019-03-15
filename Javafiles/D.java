class X{}
class Y extends X{}
class Z extends Y{}
class Demo{
public static void main(String [] rk)
	{
	   hello:
		for(int a=1; a<3; a++)
		   System.out.print("Hello");
		int i = 1;
		if(i==1)
			{break hello;}
		System.out.print("Not reachable");
	}
}