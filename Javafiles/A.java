class equalsDemo {
		public static void main(String args[]) {
			String s1 = "Hello";
			String s2 = "Hello";
			String s3 = "Good-bye";
			String s4 = "HELLO";
			System.out.println(s1 + " equals " + s2 + " -> " +
			s1.equals(s2));
			System.out.println(s1 + " equals " + s3 + " -> " +
			s1.equals(s3));
			System.out.println(s1 + " equals " + s4 + " -> " +
			s1.equals(s4));
			System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> “				   " +s1.equalsIgnoreCase(s4));
			StringBuilder sb = new StringBuilder();
	System.out.println(sb.capacity());

	StringBuilder sb1 = new StringBuilder(65);
	System.out.println(sb1.capacity());

	StringBuilder sb2 = new StringBuilder('A');
	System.out.println(sb2.capacity());

	StringBuilder sb3 = new StringBuilder("New Zealanad");
	System.out.println(sb3.capacity());
System.out.println(sb3.length());


			}
		}