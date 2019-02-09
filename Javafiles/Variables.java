class Variables
{
     int x;
     static int y;
     // y= 20 this is a error
     public static void main(String [] rk)
     {
        System.out.println("value of y is "+y);
        Variables obj = new Variables();
        System.out.println("value of x is"+obj.x);
        obj.demo();

     }
     void demo()
     {
     	int x;
     	x = 100;
     	System.out.println("value of x "+this.x);
     	System.out.println("Value of x is "+x);
     }
}