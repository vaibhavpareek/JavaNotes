import java.time.*;
class Student
{
   String name;
   LocalDate dob;
   
   void getBirthday()
   {
   	System.out.println("under constructor");
   }

   Student(String name,String dob){
   	this.name = name;
   	this.dob = LocalDate.parse(dob);
   }
 
}
class PartTimeStudent extends Student
{
	String university;
	PartTimeStudent(String name,String dob,String uni)
	{
         super(name,dob);
         this.university = uni;
	}  
}
class TestInheritance
{
	public static void main(String []vp)
	{
		PartTimeStudent pst = new PartTimeStudent("Vaibhav","2001-02-05","LPU");
          System.out.println("the university name is "+pst.university);


	} 


}