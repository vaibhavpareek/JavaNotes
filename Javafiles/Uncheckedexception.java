import java.util.*;
class InvalidStringException extends RuntimeException{

}
class MyString
{
	public static void main(String []vp)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String");
      String s = sc.nextLine();
      if(new MyString().isValid(s))
      {
        throw new InvalidStringException();
      }
	}
	boolean isValid(String str)
	{
		if(str.length() % 2 ==1)
			return true;
		else 
			return false;
	}
}