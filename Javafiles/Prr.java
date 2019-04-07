class MyABCD extends Thread  {
   public void run() {
		char c = 'A';
		try{	for(int i=0; i<26; i++)
			{
			   System.out.println(c++);	Thread.sleep(500);			}
		   }
		catch(Exception e){} 
	}
}
class MyCount implements Runnable {
   public void run()
	{	try{	for(int i=1; i<11; i++)
			{
			   System.out.println(i);
			   Thread.sleep(500);		
			}
		   }
		catch(Exception e){} 
	}
}
class ThreadDemo{
   public static void main(String [] rk)	{
		Thread t1 = new Thread(new MyABCD());	t1.start();
		Thread t2 = new Thread(new MyCount());	t2.start();
		Thread t3 = new Thread(
		  ()->{    try{
			     for(int i=1; i<11; i++){
				System.out.println("Threads are running");
			 	Thread.sleep(1000);	}
		                   }	    catch(Exception e){} 
		    } );
		t3.start();	}
}