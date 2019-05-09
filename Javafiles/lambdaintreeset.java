import java.util.*;
class Vechicle 
{   String name;
	Integer model_no;
	Vechicle(String n,int m)
	{
      this.name = n;
      this.model_no = m;
	}
	
}
class DemoTree
{
	public static void main(String[]vp)
	{
	TreeSet <Vechicle>ts = new TreeSet<>( (a,b) -> {return a.model_no.compareTo(b.model_no);});
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