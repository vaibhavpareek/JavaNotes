import java.util.*;
class InvalidStringException extends Throwable
{ 
	InvalidStringException()
	{
   super("String does not contain two diffrent vowels");
	}
}
class Demo 
{   
	static int flag=3;
	public static void main(String []vp)
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int []count = new int[5];
        /*for(int j=0;j<5;j++)
        {
        	count[j]=0;
        }*/
        for(int i=0;i<str.length();i++)
        {   
          if(str[i]=="a")
          {  count[0]++;

             }
           else  if(str[i]=="e")
          {  count[1]++;

             }
             else if(str[i]=="i")
          {  count[2]++;

             }
             else if(str[i]=="o")
          {  count[3]++;

             }
             else if(str[i]=="u")
          {  count[4]++;

             }
        
          }
          int ct=0;
         for(int i=0;i<5;i++)
         {
         	if(count[i]>0)
         	{
         		ct++;
         	}
         }
         try
         {
         if(ct>=2)
         {
         	System.out.println("String is containing atleast two diff vowels");
         }
         else
         {
         	throw new InvalidStringException();
         }
    	 } 
         catch(InvalidStringException e)
         {
         	System.out.println(e.getMessage());
         	flag--;
         	if(flag>0)
         	{
         		System.out.println("Re-enter string");
         	    String st = sc.nextLine();
         	    new Demo().check(st);
         	}
         	else
         	{
         		System.out.println("Unable to proceed");
         	}
         }

	}
	static void check(String str)
	{

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int []count=new int[5];
        for(int j=0;j<5;j++)
        {
        	count[j]=0;
        }
        for(int i=0;i<str.length();i++)
        {   
          if(str.charAt('a'))
          {  
          	count[0]++;

             }
           else if(str[i].equals('e'))
          {  count[1]++;

             }
             else if(str[i]=='i')
          {  count[2]++;

             }
             else if(str[i]=='o')
          {  count[3]++;

             }
             else if(str[i]=='u')
          {  count[4]++;

             }
        
          }
          int ct=0;
         for(int i=0;i<5;i++)
         {
         	if(count[i]>0)
         	{
         		ct++;
         	}
         }
         try
         {
         if(ct>=2)
         {
         	System.out.println("String is containing atleast two diff vowels");
         }
         else
         {
         	throw new InvalidStringException();
         }
    	 } 
         catch(InvalidStringException e)
         {
         	System.out.println(e.getMessage());
         	flag--;
         	if(flag>0)
         	{
         		System.out.println("Re-enter string");
         	    String st = sc.nextLine();
         	    check(st);
         	}
         	else
         	{
         		System.out.println("Unable to proceed");
         	}
	}
	
}
}