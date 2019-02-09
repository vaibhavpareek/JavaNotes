import java.util.*;
class Restro
{
   enum items{
   Tea_Special(10,5),Intero_Coff(78,5),Latte_Coff(52,2),Hot_Milk_Res(100,5),Restro_Spec(15,7);
   int price;
   //String[] name_items = {"Tea Special","Intero Coff","Latte Coff","Hot Milk Res","Restro Spec"};
   int quantity;
   items(int p , int q)
   {
      price = p;
      quantity = q;
   }

   }
    public static void main(String []vp)
    {
    int j=0;
    int i=0;
    System.out.println("***************************************** RESTRO ETERNITY Welcomes you ************************");
    System.out.println("\t\t\t\t******************* Choose your order ***********************");
    Restaurant re = new Restaurant();
    boolean t = true;
    start:
    while(t){
    System.out.println("  ITEMS AVAILABLE "+"\t\tPRICE" +"\t\t\tQUANTITY");
    System.out.println("\n");    
    
    for(Items s:Items.values())
    {

    	System.out.println((i+1)+". "+s+"\t\t\t"+s.price+"\t\t\t"+s.quantity);
    	System.out.println("\n");
    }

	Scanner sc = new Scanner(System.in);
	System.out.println("Please place your order");
	System.out.println("\n");
    System.out.println("Beverage Id : ");
	int id = sc.nextInt();
	System.out.println("Beverage Id : " + id);
	re.order[j] = (id-1);
	//sc.nextline();
	System.out.println("Quantity : ");
	int qua = sc.nextInt();
	re.quantity[j] = qua;
	System.out.println("\n");
    System.out.println("Quantity : " + qua);
	
    
    //sc.nextline();
    System.out.println("Do you want to add some more items");
    System.out.println("\n");
    System.out.println("Press Y for Yes or N for No");
    System.out.println("\n");
    String ch = sc.next();
    if(ch.equals("y") || ch.equals("Y"))
    {    j++;
    	continue start;
    }
    else{
    System.out.println("Thanks for buying Beverages from us..");
    System.out.println("\n");
    int bill=0;
    int k=0;
    while(re.order[k]!=0)
    {   System.out.println((k+1)+"  "+bill+" "+((re.price[re.order[k]])*(re.quantity[k]))+"\n");
    	bill = bill + ((re.price[re.order[k]])*(re.quantity[k]));
    	//System.out.println(bill);
    	k = k+1;
    }
    System.out.println("Total bill : " +bill);
    System.out.println("\n");
    t = false;
    	
    }
}
}	
}