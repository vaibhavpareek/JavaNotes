class StringPr{

	public static void main(String []vp)
	{

		String s = "hello world how are you?";
		System.out.println(s.charAt(4));
	    System.out.println(s.length());
		char [] ar = s.toCharArray();
		System.out.println(ar);
		System.out.println(s.charAt(4));
		char []b = new char[10];
		s.getChars(6,10,b,4);
        System.out.println(b);
		String s1 = "hello";
		String s2 = "hELLO";
		System.out.println(s1.compareTo(s1));
		System.out.println(s1.startsWith("he"));
		System.out.println(s1.endsWith("ello"));
		String r = s1.replace("l","W");
		System.out.println(r);
				
		
	}
}