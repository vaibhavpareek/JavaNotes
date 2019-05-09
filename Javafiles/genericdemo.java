class Student<T,U extends Number>
{
  T name;
  U cgpa;
  Student(T x,U y)
  {
  	name = x;
  	cgpa = y;
  }
}
class GenericsDemo
{
	 public static void main(String []vp)
	 {
	 	Student  s = new Student<String,Integer>("dws",15);
//	 	Student sq = new Student("ab",55);
	 }
}