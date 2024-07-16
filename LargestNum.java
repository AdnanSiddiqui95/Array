
public class LargestNum 
{

	public static void main(String[] args) 
	{
		int[]x= {10,21,35,205,40,50,101,145};
		int m=x[0];
		for(int i=1;i<x.length;i++)
		{
			if(m<x[i]) 
			{
				m=x[i];
			}
		}
		System.out.println(m);
		
		
	}

}
