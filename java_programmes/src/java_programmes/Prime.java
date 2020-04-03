package java_programmes;

public class Prime {
	public static void main(String[] args)
	{
		int start=20;
		int end=100;
		for(int i=start; i<=end; i++)
		{
			int count=0;
			for(int j=2; j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
