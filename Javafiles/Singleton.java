class Person
{
   private static Aadhar ob = null;
   class Aadhar
   {
	
	private Aadhar()
	{
      
	}
	static public Aadhar getAadhar(){
    if(ob == null)
    {
      ob = new Aadhar();
    }
    return ob;

	}
	
}