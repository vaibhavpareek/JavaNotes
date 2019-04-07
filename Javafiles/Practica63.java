import java.util.*;
interface University
{
	class Student
	{
		String  name;
		double ca_marks;
		Student()
		{

		}
		Student(String  naaa)
		{
			name = naaa;
		}
		void study()
		{
			class Evaluation
			{   Scanner sc = new Scanner(System.in);
				double getEvaluationMarks()
				{  double n;
				   double ans ;
				   System.out.println("Enter total no of questions");
                   n = sc.nextInt();
                   System.out.println("Enter answers which were wrong");
                   ans = sc.nextInt();
                   double result = ans/n;
                   return(ans/n);
   				}
			}
			Evaluation ev = new Evaluation();
			this.ca_marks =  ev.getEvaluationMarks();
		}

	}
	
}
class Demo implements University
{  
	public static void main(String []vp) 	
	{   
	    int no;
		Scanner sc = new Scanner(System.in);
        	ArrayList<University.Student> students = new ArrayList<Student>();
        	System.out.println("Enter no of students");
        	int now = sc.nextInt();
        	for(int i=0;i<now;i++)
        	{ 
        		System.out.println("Enter name of student"+i+1);
        		String namee = sc.next(); 
                University.Student s1 = new Student(namee);
        		s1.study();
        		students.add(s1);
        	}
        	double low = students.get(0).ca_marks;
        	String  na = students.get(0).name;
        	int count = 0;
        	for(Student s : students)
        	{ 
        	     if(low > s.ca_marks)
        	     {
        	     	low = s.ca_marks;
        	     	na = s.name;
        	     }

        	}
        	for(Student s : students)
        	{ 
        	     if(low == s.ca_marks)
        	     {
        	
        	System.out.println("Student with highest marks  " + s.name );
        	     	
        	     }

        	}
	}
}