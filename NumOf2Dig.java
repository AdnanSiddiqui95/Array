
public class NumOf2Dig 
{

	public static void main(String[] args) 
	{
		int[]x= {10,21,35,40,50,101,145};
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>9 && x[i]<100)
			System.out.println(x[i]);
		}
	}

}
