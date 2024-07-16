
public class CountOf2Dig 
{

	public static void main(String[] args) 
	{
		int[]x= {10,21,35,40,50,101,145};
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>9 && x[i]<100)
			count++;
		}
		System.out.println("the total count of 2 digit number is  :"+count);
	}

}
