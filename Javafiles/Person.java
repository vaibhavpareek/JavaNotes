class Person
{
   private Aadhar ob = null;
   Person
   class Aadhar
   {
	
	private Aadhar()
	{
           if(ob==null) ob = getAadhar();  
	}
	static public Aadhar getAadhar(){
    if(ob == null)
    {
      ob = new Aadhar();
    }
    return ob;

	}
	
}