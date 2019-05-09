import java.util.*;
class Vechicle implements Comparable<Vechicle> 
{   String name;
	int model_no;
	Vechicle(String n,int m)
	{
      this.name = n;
      this.model_no = m;
	}
	public int compareTo(Vechicle v)
	{
		if(this.model_no > v.model_no)
		return 1;
		else 
			return -1;
	}
}
class DemoTree
{
	public static void main(String[]vp)
	{
	TreeSet <Vechicle>ts = new TreeSet<>();
	ts.add(new Vechicle("honda",11544));
	ts.add(new Vechicle("hero",4532));
	Iterator <Vechicle> itr = ts.iterator();
	while (itr.hasNext())
	{
        Vechicle i = itr.next();
        System.out.println(i.name);
        System.out.println(i.model_no);
	}
	}
}