class StringDemo
{

 static public void main(String []vp )
 {

 	String s1 = "hello";
 	String s2 = new String("hello");

 	String s3 = new String("HELLO");
 	String s4 = "hello";
  	System.out.println("s1 == s2" + (s1==s2));
      System.out.println("s1 equals s2" + (s3.equals(s2)));
 	String s5 = s4.toUpperCase();
  	System.out.println("s4 equals s5" + (s4.equals(s5)));
  	String s6 = new String();
    String s7 = null; 	
  	
   


 }

}