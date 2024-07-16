
public class AA3 
{
	public static void show(int[] y)
	{
		y[0]=500;
	}
	public static void main(String[] args) 
	{
		int[]x= {12,15,20,50,100};
		show(x);
		System.out.println(x[0]);
	}

}
