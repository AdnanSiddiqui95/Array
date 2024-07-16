public class SmallestNum 
{
	public static void main(String[] args) 
	{
		int[]x= {10,20,200,5,100,500};
		int s=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(x[i]<s)
			{
				s=x[i];
			}
		}
		System.out.println(s);
	}

}
