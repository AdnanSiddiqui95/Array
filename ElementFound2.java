import java.util.Scanner;
public class ElementFound2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number you want to Search in the given array : ");
		String name = sc.nextLine();
		String []x= {"Adnan","Zeeshan","Kamran","Salman","Arsalan","Zikran","Ziyan"};
		boolean elementfound=false;
		for(int i=0;i<x.length;i++)
		{
			if(name.equalsIgnoreCase(x[i]))
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
