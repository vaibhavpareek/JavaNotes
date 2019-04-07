import java.io.*;
//used for input output stream by byte stream
class FileTest
{
	public static void main(String []vp) throws Exception
	{
		FileInputStream fin = new FileInputStream("qpractice.c");
		FileOutputStream fout = new FileOutputStream("../work.txt");
		//FileOutputStream fout = new FileOutputStream("../work.txt",true);for appending
		
		int c;
		while((c = fin.read()) != -1)
		{
			fout.write(c);
			//for writing on console
			//fout.write((char)c);
		} 
	}
}