import java.util.*;
interface Eligibility
{
	boolean check(Student S);
}
class Student{
	String name;
	float cgpa;
	int no_reappears;
	Student()
	{
	}
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
        this.name = sc.next();
        System.out.println("Enter your cgpa");
        this.cgpa = sc.nextFloat();        
	    System.out.println("Enter no of reappears");
	    this.no_reappears = sc.nextInt();

	}

}
class Demo{
	int elg=0;
	int EligibleStudents(Eligibility ob,Student st)
	{   
            if(ob.check(st)){
            		          elg++;
            		       }
            return elg;
	}	
	public static void main(String []vp)
	{
          ArrayList<Student> stu = new ArrayList<>();
           for(int i=0;i<5;i++)
           {
             Student s = new Student();
             s.getdata();
             stu.add(s); 	
           }
          int el1=0;
          int el2=0;
           Demo dem = new Demo();
          for(Student st:stu){
          
          el1 = dem.EligibleStudents((str)->{
                  if(str.cgpa>7.0){
                  	return true;
                  }
                  else
                  {
                  	return false;
                  }
             
          					}
          	,st);
          
          el2 = dem.EligibleStudents((str)->{
                  if(str.cgpa>7.0 && str.no_reappears<4){
                  	return true;
                  }
                  else
                  {
                  	return false;
                  }
             
          					}
          	,st);
			}
			System.out.println("Total no of students eligible for A company"+el1);
            System.out.println("Total no of students eligible for B company"+el2);
}
}