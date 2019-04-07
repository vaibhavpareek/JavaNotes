import java.util.*;
class A1 extends Thread 
{
    public void run()
    {
    	try
    	{
    	
    	for(int i=1;i<=10;i++)
    	{
    		System.out.println("hello"+i+"\n");
    	   Thread.sleep(500);
    	}
    }
    	catch(Exception e)
    	{}
    }
		}
class A2 implements Runnable
{
    public void run()
    {
    try
    	{
    	
    	for(int i=1;i<=10;i++)
    	{
    		System.out.println("me"+i+"\n");
    		Thread.sleep(1000);
    	}
    }
    	catch(Exception e)
    	{}
    }	
    }
class Demo
{
	public static void main(String []vp) throws Exception
	{
        Thread t1 = new Thread(new A1());
        Thread t2 = new Thread(new A2());
        Thread t3 = new Thread(()->{
           	for(int i=1;i<=10;i++)
    	{   try{
    		System.out.println("i"+i+"\n");
    		Thread.sleep(500);
    		}
    		catch(Exception e){}
    	}
              	
        }
        );
       t1.start();
       t2.start();
       t3.start();
	}
}