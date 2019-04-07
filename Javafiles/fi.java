import java.util.*;
import java.io.*;
class Cl
{
      static void clean(String dir_name,String ext)
      {
            File f2 = new File(dir_name);
            File []files = f2.listFiles();
            for(File f : files)
            {
            	if(f.getName().endsWith(ext))
               	f.delete();
            }
      }
	public static void main(String []vp)
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter directory you want to clean ");
       String path = sc.next();
       System.out.println("Enter extension");
       String ext = sc.next();
       File f = new File(path);
       File []file = f.listFiles();
       boolean flag = false;
       for(File fl:file)
       {
       	 if(fl.isDirectory())
       	 {
       	 	Cl.clean(fl,ext);
       	 }
       	 else if(fl.getName().endsWith(ext))
       	 {
       	 	fl.delete();
       	 	flag = true;
       	 }

       }
      if(flag)
      {
      	System.out.println("directory as well as Sub Directory are cleaned successfully");
      }
      else
      {
      	System.out.println("Already System is in the best Condition\n");
      }

	} 
}