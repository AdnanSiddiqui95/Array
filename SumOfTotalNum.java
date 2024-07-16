public class SumOfTotalNum 
{
	public static void main(String[] args) 
	{
		int[]x= {10,20,30,40,50,500};
		int sum=x[0];
		for(int i=1;i<x.length;i++)
		{
			sum=sum+x[i];
		}
		System.out.println("the sum of given array is : "+sum);
		
	}

}
