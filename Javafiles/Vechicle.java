class Vechicle
{

	int price;
	double mileage;
	Vechicle()
	{
		price = 100;
	}
	void brake()
	{
		System.out.println("Mechanical brakes");
	}
	void accelerate()
	{
		System.out.println("Accelerating");
	}
}

class Car extends Vechicle
{

}

class DriverLessCar extends Car
{
   void brake(){
   	System.out.println("overriding");
   }
}

class DemoInstanceOf
{
	public static void main(String []vp)
	{
		Vechicle v = new DriverLessCar();
		v.brake()
        System.out.println(v instanceOf DriverLessCar);
	}
}