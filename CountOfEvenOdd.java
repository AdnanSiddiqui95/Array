
public class CountOfEvenOdd 
{

	public static void main(String[] args) 
	{
		int[]x= {10,21,35,40,50,101,145};
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			count++;
		}
		System.out.println("the total count of even number is  :"+count);
		System.out.println("the total count of odd number is  :"+(x.length-count));
	}

}
