import java.util.*;
class InvalidStringException extends Exception{

}
class MyString
{
	public static void main(String []vp)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a String");
      String s = sc.nextLine();
      try{
      new MyString().isValid(s);
  			}
  	catch(InvalidStringException ex){
          System.out.println("Invalid sTRING");
  	}

	
	}
	void isValid(String str) throws InvalidStringException
	{
		if(str.length() % 2 ==1)
		throw new InvalidStringException();
	}
}