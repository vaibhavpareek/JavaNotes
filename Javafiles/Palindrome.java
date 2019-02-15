class Palindrome
{
	static public void main(String []vp)
	{
       StringBuilder s1 = new StringBuilder();
       s1.append("nitin");
       StringBuilder s2 = s1.reverse();
       if(s2.equals(s1)){
       	System.out.println("palindrome");
       }

	}
}