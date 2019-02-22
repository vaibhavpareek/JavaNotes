import java.util.Scanner;
class Recharge{
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
    {   outer:
    	while(true){
    	System.out.println("Welcome to Idea");
        System.out.println("1. View Activated Plan");
    	System.out.println("2. Select New Plan");
    	System.out.println("any other character to exit");
    	Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch==1){

        }
        else if(ch==2){
        	System.out.println("Enter your mobile number");
        	int mob_no = sc.nextInt(); 
            System.out.println("plans available for you");
            int i = 1;
            for(Recharge_Packs rc :Recharge_Packs.values())
            {  
            System.out.println(i+". "+rc + "  call :"+ rc.call_minutes + " minutes   sms : "+rc.sms_no + "  data : "+rc.data +" mb  Price = "+rc.price);
            i += 1;
            }
            System.out.println("Please choose a plan for your mobile no." );
            int mob = sc.nextInt();


        }
        else{
        	System.exit(0);
        }

        }
    }}