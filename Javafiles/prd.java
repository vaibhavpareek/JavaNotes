import java.util.*;
class InvalidStringException extends Throwable
{ 
	InvalidStringException()
	{
   super("String does not contain two diffrent vowels");
	}
}
class Demo
{  static int flag = 3;
	public static void main(String []vp)
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int []index = new int[5];
        
        while(flag>0)
        {
        	index[0] = str.indexOf('a');
			index[1] = str.indexOf('e');
        	index[2] = str.indexOf('i');
        	index[3] = str.indexOf('o');
        	index[4] = str.indexOf('u');
        int count =0;
        for(int i=0;i<5;i++)
        {
        	if(index[i]!= -1)
        	{
        		count++;
        	}
        }
        try
        {
        	if(count>=2)
        {
            System.out.println("correct string");
        	break;
        }
        else
        {
        	throw new InvalidStringException();
        }

    	}
         catch(InvalidStringException e)
         {
         	System.out.println(e.getMessage());
         	if(flag>0)
         	{
         	System.out.println("Re-enter the string");
         	str = sc.nextLine();
         	flag--;
            }
         	else
         	{
         	    System.out.println("Unable to proceed");
         	}
         }
       }
   	}

     }
