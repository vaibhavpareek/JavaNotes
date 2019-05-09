import java.util.*;
class Employee
{
	Integer emp_id,salary;
	String name;
	Employee(String na,int id,int sal)
	{
		name = na;
		emp_id = id;
		salary = sal;
	}	

}
class MapTest
{
	public static void main(String []vp)
	{
		int []ar={1,3,4,3,1,1,2,3,2,4,5};
		int N=2;
	    HashMap<Integer,Integer> hm = new HashMap<>();
	     int count =1;
	    for(Integer i : ar)
	    {    
	    	if(hm.get(i)!=null)
              {
				hm.put(i,count);
				count++;
              
              }
              	
	    } 
	    Set<Integer> keys = hm.keySet();
		for(Integer k:keys)
		{
				System.out.println(k + " "+hm.get(k));		
		}  

	}
}