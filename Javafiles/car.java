import java.util.*;
class Car
{
	private String name;
	private double mileage;
	private int price;
	Car(String n, double m,int p)
	{
		name = n;
		mileage = m;
		price = p;
	}
	public void getdata()
	{	System.out.println("Enter details of a vechicle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		name = sc.nextLine();
		System.out.println("Enter the mileage");
		mileage = sc.nextDouble();
		System.out.println("Enter the price");
		price = sc.nextInt();
	}
	public static void main(String []vp)
	{
		HashMap<Car> ob = new HashMap<>();
		

	}
}