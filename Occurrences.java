import java.util.Scanner;
public class Occurrences 
{
	public static void main(String[] args) 
	{
		int []x= {10,20,30,40,40,10,15,20,10,10,60,90,90,30,20,40};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr any number to check the Occurrences of the number: ");
		int num=sc.nextInt();
		int count=0;
		for(int n:x)
		{
			if(n==num)
			{
				count++;
			}
		}
		System.out.println("The Occurrences of the " +num + " number: "+count);
	
	}

}
