import java.util.*;
class Banking{
	public static void main(String []rk)
	{   int i=3;

       attempt:
       
       while(true){
		
		System.out.println("***************************************	Welcome In VPBank Records ********************************************");
		System.out.println("\n");
        System.out.println("\n");
	    System.out.println("Enter your account number");
        Scanner sc = new Scanner(System.in);
        int Account_no = sc.nextInt();
       System.out.println("Enter your password");
        int password = sc.nextInt();
        System.out.println("\n");
	   if(password != 1245)
            {
              System.out.println("You have entered wrong password");
              i--;
              System.out.println("TRY AGAIN YOU ARE LEFT WITH "+ i + " ATTEMPTS");
              if(i==0)
              {
              System.out.println("your attempts are finsihed ");
              System.exit(0);
              }
              continue attempt;
            }
        else{
            System.out.println("you are successfully logged in");
             }
         
        System.out.println("\n");
	    System.out.println("\n");
        
        
	    System.out.println("\n");
	    }
	}

}