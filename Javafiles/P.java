class Demo{
   public static void main(String []vp){

	StringBuilder sb = new StringBuilder();
	System.out.println(sb.capacity());

	StringBuilder sb = new StringBuilder(65);
	System.out.println(sb.capacity());

	StringBuilder sb = new StringBuilder(“A”);
	System.out.println(sb.capacity());

	StringBuilder sb = new StringBuilder('A');
	System.out.println(sb.capacity());
}
}