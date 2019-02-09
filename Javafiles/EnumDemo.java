class EnumDemo{
enum Demo
   {
      coffee,tea(10),burger(30);
      int price;//price for the items
      //constructor
      Demo(int p)
      {
           this.price = p;
      }
      Demo()
      {
      	price = 10;
      }

   }
  System.out.println(Demo.price);
}