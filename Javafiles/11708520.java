import java.io.*;
import java.util.*;
import java.util.Date.*;
class InvalidPathException extends Throwable
{

}
class CheckDir 
{
	public boolean validDirectory(String p) throws InvalidPathException,FileNotFoundException
 	{
		File fp = new File(p);
		if(fp.exists()){
			if(fp.isDirectory())
			{
				File[] ls;
				ls = fp.listFiles();
				File max = ls[0];
				File min = ls[0];
				FIle temp = ls[0];
				for(File i:ls)
				{
					if(new Date(i.lastModified()).compareTo(new Date(max.lastModified())) > 0)
					{
						max = i;
					}
					if(new Date(i.lastModified()).compareTo(new Date(min.lastModified())) < 0)
					{
						min = i;
					}
					System.out.println("hell");
				}
				FileOutputStream fout = new FileOutputStream(max);
				FileInputStream fin = new FileInputStream(min);
				Character ch = fin.read();
				while(ch!=-1)
				{
					fout.write(ch,"a");
					ch = fin.read();
				}
				System.out.println("Files are successfully appended and Modified");


				temp.delete();
				System.out.println("File is deleted successfully");
 					return true;
				
			}
			else
			{
				throw new InvalidPathException();
			}

		}
		else
		{
			throw new InvalidPathException();
		}

	}
	public static void main(String []vp) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path for directory");
		String path;
		boolean flag = false;
		while(!flag)
		{
		try
		{	
			path = sc.nextLine();
			CheckDir ck = new CheckDir();
			boolean res = ck.validDirectory(path);
			if(res)
			{
 				flag = true;

			}
		}
		catch (InvalidPathException e )
		{
			System.out.println("Entered path does not corresponds to directory");
			System.out.println("Reenter the path again");
		}
	}
	}

}