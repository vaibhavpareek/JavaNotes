import java.util.*;
import java.lang.Math.*;
class Table
{
	public static void main(String []pj)
	{
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.println("Enter the number of elements you want to enter");
		n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter elements ");
		for(int i=0;i<n;i++)
		{
           ar[i] = sc.nextInt();
		}
		int temp = ar[0];
		for(int j=1;j<11;j++)
		{
			System.out.println(ar[0]+" x "+j+" = " +(ar[0]*j));
		}
		int k=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(Math.pow(temp,i)==ar[j])
				{
                   count++; 
				}
			}
		}
		int arr[]= new int[count];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(Math.pow(temp,i)==ar[j])
				{
                   arr[k] = ar[j];
                   k++;
				}
			}
		}
		for(int i=0;i<count;i++)
		{
			System.out.println(arr[i]);
		}
		for(int r=0;r<arr.length;r++)
		{
			System.out.println("table "+(r+1));
			for(int i=1;i<11;i++)
			{
		        System.out.println(arr[r]+" x "+i+" = " +(arr[r]*i));		
			}
		}
		System.out.println("DONE");
	}
}