class Break{

  public static void main(String [] rk)
  {
  	outer:
  	 for(int i=0;i<3;i++)
  	 {
  	 	System.out.println("OUTER"+i);

        inner:
          for(int j=0;j<3;j++)
          {
          	System.out.println("Inner:"+j);
          	if(i==j+1)
          		break outer;
          	System.out.println("bye");
          }

  	 }
  }	
}