import java.util.*;
class DemoTree
{
	public static void main(String[]vp)
	{
	TreeSet <Integer>ts = new TreeSet<>();
	ts.add(10);
	ts.add(5);
	ts.add(10);
	ts.add(12);
	Iterator <Integer> itr = ts.iterator();
	while (itr.hasNext())
	{
        Integer i = itr.next();
        System.out.println(i);
	}
	}
}