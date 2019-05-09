import java.util.*;
class Bank
{
   double roi;
   double amount;
   int years;

 	void calculate()
 	{
 		assert this.roi>0:"roi is less than 0";
		assert this.amount>0:"amount is less than 0";		
		assert this.years>0:"years is -ve ";
        System.out.println("Total amount now = "+(amount+(amount*roi*years)));
 	}
    public static void main(String []vp)
    {
    	System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        Bank ob = new Bank();
    	ob.amount = sc.nextDouble();
		System.out.println("Enter the years");
        ob.years = sc.nextInt();
        System.out.println("ENter the roi");
        ob.roi = sc.nextDouble();
        ob.calculate();
    }
}
