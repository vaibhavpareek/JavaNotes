import java.util.*;
class Recharge{
        Long mob_no;
        int plan_no;
     public enum Recharge_Packs {
		Plan1(100,50,500,59),Plan2(200,100,1000,46),Plan3(300,200,2000,79),Plan4(500,300,4000,49);
		int call_minutes;
		int sms_no;
		int data;
		int price;
		Recharge_Packs(int c,int s,int d,int p)
        {

			call_minutes = c;
	        sms_no = s;
	        data = d;
	        price = p;		
	    }

        }

    public static void main(String []vp)
    {   int j=0;
    	//Recharge []r = new Recharge[100]; this is used if we are provided with the no of objects.
    	ArrayList <Recharge> org = new ArrayList<>(); 
    	while(true){
    	System.out.println("Welcome to Idea");
        System.out.println("1. View Activated Plan");
    	System.out.println("2. Select New Plan");
    	System.out.println("any other character to exit");
    	Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch==1){
            
            System.out.println("enter your phone number");
            long mo = sc.nextLong();
            int count = 0;
            for(int k=0;k<j;k++)
            {
                Recharge r = org.get(k);
                if(r.mob_no==mo){
                	int plan = r.plan_no ; 
                	System.out.println("the existing plan for this mobile number is"+Recharge_Packs.values()[plan-1] +" details are :\n");
                	System.out.println(Recharge_Packs.values()[plan-1].call_minutes);
					System.out.println(Recharge_Packs.values()[plan-1].sms_no);
					System.out.println(Recharge_Packs.values()[plan-1].data);
					System.out.println(Recharge_Packs.values()[plan-1].price);
					count += 1;
                }
            }
            if(count == 0)
            {
            	System.out.println("there is no existing plan for this number ,please choose among the one.");
   ;         }
        }
        else if(ch==2)
        {   
            Recharge r = new Recharge();
            r.getPlan();
            org.add(r);
            j++;
        }
        else
        {
        	System.exit(0);
        }
       // System.out.println("hello");
        }
    }

void getPlan()
        {
            System.out.println("Enter your mobile number");
        	Scanner sc = new Scanner(System.in);
        	Long mob = sc.nextLong();
        	this.mob_no = mob;//
            System.out.println("plans available for you");
            int i = 1;
            for(Recharge_Packs rc :Recharge_Packs.values())
            {  
            System.out.println(i+". "+rc + "  call :"+ rc.call_minutes + " minutes   sms : "+rc.sms_no + "  data : "+rc.data +" mb  Price = "+rc.price);
            i += 1;
            }
            int p = sc.nextInt();
            this.plan_no = p;
        }
   }