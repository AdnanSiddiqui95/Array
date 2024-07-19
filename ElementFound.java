import java.util.Scanner;
public class ElementFound 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number you want to Search in the given array : ");
		int num=sc.nextInt();
		int []x= {45,53,64,7,46,76,451};
		boolean elementfound=false;
		for(int i=0;i<x.length;i++)
		{
			if(num==x[i])
			{
				elementfound=true;
				System.out.println("Element Found");
			}
		}
		if(!elementfound)
		{
			System.out.println("Element Not Found");
		}
	}

}
