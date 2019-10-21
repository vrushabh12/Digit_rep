package digit;

public class SumD {
	
	int sum=0;
	//comment added
	public int fun(int a)
	{
		while (a!=0)
		{
			sum=sum+a%10;
			a/=10;
			
		}
		return sum;
	}

}
