public class GreaterNB 
{
	public static void main(String[] args) 
	{
		int []x= {45,20,55,40,60,43,54,91,90,10,50,20,26};
		int j=x.length-1;
		if(x[0]>x[1])
		{
			System.out.println(x[0]);
		}
		for(int  i=1;i<j;i++)
		{
			if(x[i]>x[i-1] && x[i]>x[i+1])
			{
				System.out.println(x[i]);
			}
		}
		
		if(x[j]>x[j-1]);
		System.out.println(x[j]);
	}

}
