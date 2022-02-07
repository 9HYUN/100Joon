package stage5_function;

import java.util.ArrayList;
import java.util.Arrays;

public class Number4673 
{
	public static void main(String[] args) 
	{
		boolean[] resultNumber = new boolean[10001];
		
		
		for (int i=1; i <= 10000; i++)
		{
			int result = total(i);
			if(result <= 10000)
			{
				resultNumber[result] = true;
			}
		}
		
		for(int i = 1; i < resultNumber.length; i++)
		{
			if(!resultNumber[i])
			{
				System.out.println(i);
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
