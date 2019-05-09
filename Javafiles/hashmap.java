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
		System.out.println(hm.put(9212,new Employee("abd",41,545465)));
		System.out.println(hm.put(921,new Employee("ccg",4,545465)));
		System.out.println(hm.put(92,new Employee("abd",78,545465)));
		Employee emp = hm.put(9212,new Employee("abd",41,545465));
		System.out.println("repaced "+emp.name);
		System.out.println(hm.get(9212).name);

	}
}