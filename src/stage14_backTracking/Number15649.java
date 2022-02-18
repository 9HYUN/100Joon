package stage14_backTracking;

import java.util.Scanner;

public class Number15649 
{

	public static int[] arr1;
	public static boolean[] arr2;
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int depth = 0;
		arr1 =new int[number2];
		arr2 =new boolean[number1];
		dfs(number1, number2, 0);
	}
	
	public static void dfs(int number1, int number2, int depth)
	{
		if(depth == number2)
		{
			for (int val : arr1)
			{
				System.out.println(val + " ");
			}
			return;
		}
		for(int i = 0; i < number1; i++)
		{
			if(!arr2[i])
			{
				arr2[i] = true;
				arr1[depth] = i + 1;
				dfs(number1, number2, depth+1);
				arr2[i] = false;
			}
		}
	}	
	
}