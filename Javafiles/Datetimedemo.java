import java.time.*;
class Datetimedemo
{
	public static void main(String []vp)
	{
		//LocalDate d = LocalDate.now();
		//System.out.println(d);
	    //LocalTime t = LocalTime.now();
		//System.out.println(t);
        //LocalDateTime dt = LocalDateTime.now();
		//System.out.println(dt);
        LocalDate ld = LocalDate.of(1998,2,2);
        System.out.println(ld.getDayOfWeek());
	    LocalDate lt = LocalDate.parse("1998-02-02");
        System.out.println(lt);
	    
	}


}