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
		HashMap <Integer ,Employee> hm  = new HashMap<>();
		hm.put(7894,new Employee("abc",101,45454));
		hm.put(7895,new Employee("abcd",102,4545));
		hm.put(7896,new Employee("abce",103,454));
		hm.put(7897,new Employee("abcf",104,45));
		hm.put(7898,new Employee("abcg",105,454545));
		Set<Integer> keys = hm.keySet();
		for(Integer k:keys)
		{
				System.out.println(k + " "+hm.get(k).name);		
		}
	}
}