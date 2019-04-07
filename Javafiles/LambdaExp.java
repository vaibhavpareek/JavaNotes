class LambdaDemo{

  public static void main(String []vp)
  {
  	Thread t1 = new Thread(
                new Runnable()
                {
                	public void run(){
                		char c='a';
                		for(int i=0;i<26;i++)
                		{
                			System.out.println(c);
                			c++;
                			try{
                				Thread.sleep(500);
                			}
                			catch(Exception e){

                			}
                		}
                	}
                }

  		);
  	Thread t2 = new Thread(
            ()->{
            	char c='A';
                		for(int i=0;i<26;i++)
                		{
                			System.out.println(c);
                			c++;
                			try{
                				Thread.sleep(500);
                			}
                			catch(Exception e){

                			}
                		}
            }
  		);
  t1.start();
  t2.start();
  }

}