import java.util.*;
class ArrDemo
{

public static void main(String...vp)
{

   ArrayList <Double> al1 = new ArrayList<>();
   //ArrayList al1 = new ArrayList(int cap);
   al1.add(4.8);
   al1.add(52.2);
   al1.add(4.3);
   al1.add(4.3);
   al1.add(2,1.3);//this function is used for the list and all except set
   //al1.add("hello");
   //<>type infrence diamond
   //al1.add(5.05);
   System.out.println(al1.remove(4))//it will delete at index 4
   System.out.println(al1.remove(integer(4)))//Integer i = 1  
   for(Double d:al1)
   {
   	System.out.println(d);
   }

}
}

//here array will be formed only when we add the element