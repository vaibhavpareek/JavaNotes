import java.util.*;
import java.time.*;
class ContactList
{
  String Name = new String();
  long contact_no;
  LocalDate Dateofbirth;

  public static void main(String []vp)
  {  int count = 0;
  	ArrayList <ContactList> cont = new ArrayList<>();
  	while(true)
  	{
      System.out.println("welcome to my directory");
      Scanner sc = new Scanner(System.in);
      System.out.println("1. Add Contact");
      System.out.println("2. View Contact");
      System.out.println("enter any other character to exit");
      int ch = sc.nextInt();
      if(ch == 1)
      {  boolean flag2 = false;
        ContactList temp = new ContactList();
        System.out.println("Enter your details for the directory");
    	System.out.println("Enter your Name");
    	String Search = sc.next();
    	//sc.nextLine();
    	for(int i=0;i<count;i++)
         {
         	ContactList cl = cont.get(i);
         	if(Search.equalsIgnoreCase(cl.Name))
         	{
         		System.out.println("This name is already existing in the contact list");
                System.out.println("Please choose a choie");
                System.out.println("1. Update the details");
                System.out.println("2. Add as a new contact");
                int choice = sc.nextInt();
                if(choice==1)
                {
                   cl.update();

                }
                else if(ch==2)
                {
                  temp.getDetails(Search);
                  cont.add(temp);
                  count += 1;        	
                }
                flag2 = true;   
         	}
         	
         }
         if(flag2==false){
                  temp.getDetails(Search);
                  cont.add(temp);
                  count += 1;
         	}

                }
                
    	
      else if(ch ==2)
       {
       	 boolean flag = false;
         System.out.println("Enter the name of a person you want to search");
         String Search = sc.next();
         //sc.nextLine();
         for(int i=0;i<count;i++)
         {
         	ContactList cl = cont.get(i);
         	if((cl.Name.indexOf(Search)) != -1)//cl.Name.contains(Search)
         	{   //String se = cl.Name;
         		//System.out.println("Welcome " + a);

         		System.out.println("Name : " + cl.Name);
         	    System.out.println("Contact No : " + cl.contact_no);
         		System.out.println("Date of birth : " + cl.Dateofbirth);
         	    flag = true;
         	}
         	if(flag==false){
           System.out.println("There is no person in this list with this name");
         	}

         }
      }
      else
      {
        System.out.println("thanks for using this software");
        System.exit(0);
      }

            	}
  }
    void getDetails(String n)
    {
    	 Scanner sc = new Scanner(System.in);
    	this.Name = n;
    	System.out.println("Enter your Phone number");
    	this.contact_no = sc.nextLong();
    	System.out.println("Enter your Dateofbirth in yyyy-mm-dd");
    	String t = sc.next();
    	this.Dateofbirth = LocalDate.parse(t);
    	//this.Dateofbirth = t;
    	System.out.println("Details are successfully saved");

    }
     void update()
     {
     	System.out.println("the previous details of Name : " +this.Name );
     	System.out.println("Contact : " + this.contact_no );
     	System.out.println("Date of birth : " + this.Dateofbirth);
     	System.out.println("Please enter new contact details");
     	Scanner sc = new Scanner(System.in);
     	long no = sc.nextLong();
     	this.contact_no = no;
     	System.out.println("Details are modified successfully");
     }
}