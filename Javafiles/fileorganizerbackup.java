import java.io.*;
import java.util.*;
import java.nio.file.*;
class InvalidPath extends Throwable
{}
class NotADirectory extends Throwable
{}
class FileOrganizer
{
	static void organize(File f1) throws IOException
{
	try
        {
        	if(f1.exists())
        	{
               try
               {
               	 if(f1.isDirectory())
               	 {
                    File []files = f1.listFiles();
                    int i=0;
                    for(File f:files)
                    {
                       String s = f.getAbsolutePath();
                       int x = s.lastIndexOf(".");
                       String sub = s.substring(x+1,s.length());
                       File folder = new File(f1+"/"+sub);
                       folder.mkdir();                       
                    }
                    for(File f:files)
                    {
                       String s = f.getAbsolutePath();
                       int x = s.lastIndexOf(".");
                       String sub = s.substring(x+1,s.length());
                       File dest = new File(f1+"/"+sub+"/"+f.getName());
                       Files.move(f.toPath(),dest.toPath(),StandardCopyOption.REPLACE_EXISTING);
                       System.out.println("All files are Organized Systematically");
                    }
               	 }
               	 else
               	 	throw new NotADirectory();
               }
               catch(NotADirectory n)
               {
               	System.out.println("It's a file,so it cannot be Organize .");
               }
        	}
        	else
        	{
        		throw new InvalidPath();
        	}
        }
        catch(InvalidPath in)
        {
        	System.out.println("This path doesn't exist");
        	System.out.println("Re-Enter the path");
        	Scanner sc = new Scanner(System.in);
        	String path = sc.nextLine();
            File fn = new File(path);
            organize(fn);
        }
        catch(NoSuchFileException no)
        {
        	System.out.println("All files are already managed perfectly");
        }
}
	public static void main(String[]vp) throws IOException
	{   
		System.out.println("Enter path");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
        File f1 = new File(path);
        organize(f1);
	}
}