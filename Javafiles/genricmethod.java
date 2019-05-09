class Test
{
	public static <E extends Comparable<E>> E max(E []list)
	{
		E maximum = list[0];
		for (E ob : list ) {
			if(ob.comareTo(maximum)>0) maximum = ob;
		}
		return maximum;
	}
}
class Generic
{
	public static void main(String []vp)
	{
		Integer []arr={15,1,19,20,32,8};
		System.out.println(Test.max(arr));
	}
}