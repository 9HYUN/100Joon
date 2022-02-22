package stage18_stack;

import java.util.Scanner;

public class Number10773 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		int sum = 0;
		int[] hyun = new int[count];
		
		for(int i = 0; i<hyun.length; i++)
		{
			hyun[i] = input.nextInt();
			if(hyun[i] == 0)
			{
				for(int j = 0; j <= i; j++)
				{
					if(hyun[i-j] != 0) 
					{
						hyun[i-j] = 0;
						break;
					}
				}
			} 
		}
		for(int i = 0 ; i<hyun.length; i++)
		{
			sum += hyun[i];
			System.out.print(hyun[i]);
		}
		System.out.println();
		System.out.println(sum);
		
	}

}
