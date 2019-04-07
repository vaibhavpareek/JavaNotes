class DemoException
{
	public static void main(String []vp)
	{
		int x = Integer.parseInt(vp[0]);
		int y = Integer.parseInt(vp[1]);
        DemoException ob = new DemoException();
        ob.add(x,y);
        ob.divide(x,y);
        ob.multiply(x,y);
	}
	private void add(int x,int y)
	{
		int c = x+y;
		System.out.println("result add "+c);
	}
	private void divide(int x,int y)
	{
		int c = x/y;
		System.out.println("result divide "+c);
	}
	private void multiply(int x,int y)
	{
		int c = x*y;
		System.out.println("result multiply "+c);
	}
}