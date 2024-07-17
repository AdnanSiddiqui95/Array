public class ReverseOfArrayEle 
{
	public static void main(String[] args) 
	{
		int []x= {45,53,64,7,46,76,451};
		System.out.println("Before Swapping :");
		for(int b=0;b<x.length;b++) 
		{
			System.out.print(x[b]+"  ");
		}
		System.out.println();
		System.out.println("After Swapping:  ");
		int j=x.length-1;
		for(int i=0;i<j;i++,j--)
		{
			int temp=x[i];
			x[i]=x[j];
			x[j]=temp;
		}
		for(int s=0;s<x.length;s++)
		{
		System.out.print(x[s]+"  ");
		}
	}

}
