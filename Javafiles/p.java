class p{
	public enum pr{
		data(14),dh(45);
		int day;
		pr(int a){
            day =a ;
		}
	}

	public static void main(String []vp)
	{
		for(pr s : pr.values())
		{
			System.out.println(s);
		    System.out.println(s.day);
				
		}
		System.out.println(pr.values()[0].day);
	}
}