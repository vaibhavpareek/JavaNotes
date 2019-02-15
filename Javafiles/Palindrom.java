class Palindrom
{
	static public void main(String []vp)
	{
      
      StringBuilder s1 = new StringBuilder(vp[0]);
      StringBuilder s2 = new StringBuilder(s1.reverse());
      if(s1.toString().equals(vp[0]))
      	System.out.println("yes");
      //s1.append("hello");
      //s1.replace(4,2,"he");

	}
}