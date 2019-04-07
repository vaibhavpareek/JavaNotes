import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
class InvalidPath extends Throwable
{
}

class NoDirectoryException extends Throwable
{
}
class FileOrganizer
{
	static void searchContent(String dir_name)
      {     
      	    try
      	    {
      	    Path source = Paths.get(dir_name);
			Stream<Path> st = Files.list(source);
			//ArrayList<source> al = st.collect(COllectors.toList());
			Object[]pt = st.toArray();
			for(Object ob:pt)
			 {  
			  Path p = (Path)ob; 
			  File fl = p.toFile();
			  if(fl.isFile())
			  {
			  	String s = fl.getAbsolutePath();
			  	int x = s.lastIndexOf(".");
                String ext = s.substring(x+1,s.length());

			  }
             }
            }
            catch(Exception e)
             {}
      }
	public static void main(String []vp)
	  {
		FileOrganizer fl = new FileOrganizer();
        System.out.println("Enter the path");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File f1 = new File(path);
        try
        {
          if(f1.exists())
           {
              try
              {
                  if(f1.isDirectory())
                  {    
                  	fl.searchContent(f1.getName());
                  }
                  else
                  {
                 	throw new NoDirectoryException();
                  }

              }
              catch(NoDirectoryException n)
              {
              	System.out.println("No such directory is present");
              	System.out.println("Enter new path");
              	String s = sc.nextLine();
              	File f2 = new File(s);
              }
          }  
          else
          {
          	throw new InvalidPath();
          }
       }
       catch(InvalidPath e)
       {
       	System.out.println("Enter the path");
        String path1 = sc.nextLine();
        f1 = new File(path1);    
       }
	}
}