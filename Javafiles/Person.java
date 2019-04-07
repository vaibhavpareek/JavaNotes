import java.util.*;
import java.time.*;
class Person{
    	String name;
        LocalDate dob;
    	ArrayList<Vechicle> vechicles = new ArrayList<>(); 
    	void getdata(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your Name");
         this.name = sc.nextLine();
         //sc.nextLine();
         System.out.println("Enter your Dob in yyyy-mm-dd");
         String d_o_b = sc.nextLine();
         this.dob = LocalDate.parse(d_o_b);
    	}
     
        void add_Vechicle(){
         
        Vechicle v = new Vechicle();
        v.getvech();
        vechicles.add(v);
        }
        
        void view_Vechicle()
        {
        	for(Vechicle v:vechicles)
        	{
        		System.out.println("Vechicle No :  "+v.vechicle_no + " Modal No : " +v.modal_no+"\n");
        	}

        }

        class Vechicle{
  
         String vechicle_no;
         String modal_no;
         void getvech(){
      
            System.out.println("Enter Vechicle Number");
            Scanner sc = new Scanner(System.in);
             this.vechicle_no = sc.nextLine();
     //        sc.nextLine();
			System.out.println("Enter Modal Number");
            this.modal_no = sc.nextLine();
            System.out.println("\nYou have bought a new vechicle !!!congrats");
         }

        }
     public static void main(String []vp)
     {     int personP=0;
          ArrayList<Person> pers = new ArrayList<>();
         outer:
         while(true)
         {  
         	System.out.println("Welcome to vechicle generator");
         	Person p = new Person();
            System.out.println("Press 1 TO add new person");
            System.out.println("Press 2 TO add view Info about vechiles");
            System.out.println("Press 3 TO exit");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            if(ch==1)
            {   personP++; 
            	p.getdata();
            	pers.add(p);
            	
            }
            else if(ch==2)
            {   int count =0;
            	sc.nextLine();
            	System.out.println("Enter your name ");
            	String s_name = sc.nextLine();
            	sc.nextLine();
            	System.out.println("Enter your dob in yyyy-mm-dd");
            	LocalDate s_dob = LocalDate.parse(sc.nextLine());
            	//Period P;
            	 inner:
            	for(Person pe:pers)
            	{ 
            		Period P =Period.between(s_dob,LocalDate.now());
                   if(s_name.equals(pe.name) & s_dob.equals(pe.dob)) 
                   {  
                   	  System.out.println("Person FOUND details");
                   	  if(P.getYears() >= 18)
                     {
                     	System.out.println("Congrats you are elegible you can buy vechicle\n");
                     	System.out.println("Please choose the choice\n");
                     	System.out.println("1.Add Vechicle\n");
                    	System.out.println("2.View Vechicle\n");
                     	System.out.println("3.Go to main menu\n");
                     	int c = sc.nextInt();
                     	if(c==1)
                    	 {
                     		pe.add_Vechicle();
                     	}
                     	else if(c==2){
                        	pe.view_Vechicle();
                     	}
                     	else if(c==3)
                     		{
                     			break inner;
                     		}
                     	else
                     		{
                     			System.out.println("Please choose among the choice");
                     		}

                      }
                      else
                      {
                      	System.out.println("Sorry you are too young to drive a vechicle");
                      } 
            	}
            	else
            	{  
            		count++;
            	
            	}
            }
            if(count == personP)
            {
               System.out.println("Person with this name doesn't found or may be dob is wrong");
            }
        }
            	else if(ch==3)
            	{
            		System.out.println("Thanks for using generator");
            		System.exit(0);
           			 }
          

         			}
     }
 }

 

