public class PracAvgOfArray {

	public static void main(String[] args) 
	{
		int[]x= {10,20,30,40,50,33,40,330};
		
		int count=0;
		
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum+=x[i];
			count++;
		}
		int avg=sum/count;
		System.out.println("The total sum of array elements : " +sum);
		System.out.println("The total count of array elements : " +count);
		System.out.println("The avegage of array elements : " +avg);
	}

}