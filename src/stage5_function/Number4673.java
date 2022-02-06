package stage5_function;


public class Number4673 
{
	public static void main(String[] args) 
	{
		for (int i=1; i < 10001; i++)
		{
			System.out.println(total(i));
			if (total(i) == 10000)
			{
				break;
			}
		}
		
	}
	
	public static int total(int number)
	{
		int sum = number;
		
		while(number != 0)
		{
			sum += (number %10);
			number = number/10;
		}
		
		return sum;
		
	}
}
