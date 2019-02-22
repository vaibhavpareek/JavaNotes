import java.time.*;
class DateTimeApi{
	public static void main(String []vp)
	{
       LocalDate ltd = LocalDate.now();
       System.out.println(ltd);
	   System.out.println(LocalDate.of(1998,Month.JANUARY,19));
       LocalDate a = LocalDate.parse("1998-02-02");
       System.out.println(LocalDate.parse("1998-02-02"));
       System.out.println(a.getDayOfWeek());
       System.out.println(a.withYear(2000));
       

	}	
	
}