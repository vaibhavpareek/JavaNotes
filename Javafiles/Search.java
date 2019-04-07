import java.util.*;
import java.io.*;
class SearchEngine
{
	void search(File ob,String str)
	{
          File []files = ob.listFiles();
          for(File fl:files)
          {  String s;
          	if(fl.isDirectory())
          	{
          		search(fl,str);
          	}
          	else if( fl.getName().indexOf(str) != -1  )
          	{   
                s = fl.getName();
               System.out.println(fl.getAbsolutePath());
          }
		}
 	}
    public static void main(String []vp)
    {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter the Directory");
    	String path = sc.next();
    	System.out.println("Enter the Keyword ");
    	String key = sc.next();
    	File f = new File(path);
    	new SearchEngine().search(f,key);
    }
}
