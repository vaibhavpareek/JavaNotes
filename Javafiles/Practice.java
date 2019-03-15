import java.util.*;
abstract class Account
  {
	int Acc_num;
	final double rate_of_int ;
	double balance;
	Account(double rt,double bl)
	{
		rate_of_int = rt;
		balance = bl;
	}
	abstract void annual_int();
	
	}

class SavingAccount extends Account
{
    private static int Acc_no = 10001;
    
    void annual_int()
    {
       balance = balance + (balance * rate_of_int)/100; 
    } 
    
    SavingAccount(double balance)
    {
    	super(balance,4.5);
    	Acc_num = Acc_no++;
     
    }
    void getBalance()
   {
   	
   	System.out.println("The account balance is"+this.balance);
   
   }

}

class CurrentAccount extends Account
{
	private static int Acc = 5001;
    
    void annual_int()
    {
       balance = balance + (balance * rate_of_int); 
    } 
    
    CurrentAccount(double balance)
    {
    	super(balance,3.25);
    	Acc_num = Acc++;
     
    }
    void checkBalance()
   {
   	
   	System.out.println("The account balance in Current account is"+this.balance);
   
   }

}
class Main
{
    public static void main(String []vp)
    {
    	 ArrayList<Account> ob = new ArrayList<>();
         CurrentAccount c1 = new CurrentAccount(465.5);
         SavingAccount  c2 = new SavingAccount(4654.5);
         CurrentAccount c3 = new CurrentAccount(475.5);
         SavingAccount c4 = new SavingAccount(795.2);
         ob.add(c1);
         ob.add(c2);
         ob.add(c3);
         ob.add(c4);
         
         Scanner ac = new Scanner(System.in);
         boolean flag =true;

    	for(Account o : ob)
    	{ if(o.Acc_num==ac)
    		{
    			if(o instanceof CurrentAccount)
    			{
    				CurrentAccount x = (CurrentAccount)ob;
    		    	x.checkBalance();
    			}
           		else{
           		SavingAccount x = (SavingAccount)ob;
           		x.getBalance();
           	}
         flag = false;
    	}
         }
         if(flag == true)
         {
         	System.out.println("no such account number is present");
         }


    }


}
