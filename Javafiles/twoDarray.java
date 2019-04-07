import java.util.*;
class Array_2d
{
	int matrix[][] = new int[2][2];
	int mt[] = new int[3];
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
              matrix[i][j] = sc.nextInt();
			}
		}
	}
	void showdata()
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
             System.out.println(matrix[i][j]);
            }
		}	
	}
   public static void main(String []vp)
   {
   	  Array_2d ob = new Array_2d();
   	  ob.getdata();
   	  ob.showdata();
   }
}