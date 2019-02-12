class Varargs
{
	public void demo(int...x)
	{  int sum = 0;
		for(int i=0;i<x.length;i++)
		{  
			sum += x[i];
			System.out.println("sum "+sum );
		}
	}

	public static void main(String []vp)
	{
		new Varargs().demo(1,2,3,4,5,6,8,8,88,12,8600);
	},
},