class Pr{
	public static void main(String []vp){
	String s = "042";
	String a = "hello";
	System.out.println(a+s+45);
    char c;
    System.out.println(a.charAt(2));
    char []ch = a.toCharArray();
    System.out.println(ch);
    StringBuilder sb = new StringBuilder("helllo");
    System.out.println(sb.ensureCapacity());
    System.out.println(sb.capacity());
    System.out.println(sb.length());
}
}