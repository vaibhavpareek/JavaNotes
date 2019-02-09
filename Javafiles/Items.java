enum Items
   {
      coffee,tea(10),burger(30);
      int price;//price for the items
      //constructor
      Items(int p)
      {
           this.price = p;
      }
      Items()
      {
      	price = 10;
      }

   }
class TestEnum
{
  
  
  public static void main(String ...vp)
  {
     Items ob = Items.burger ;
     switch(ob)
    {
      case burger:System.out.println("burger"+ob.price);
      case tea:System.out.println("tea"+ob.tea.price);
      break;
      case coffee:System.out.println("coffee"+ob.price);
      break;

    }
  } 
}
//passing a name of an enum in switch statement is error