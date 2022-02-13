package stage02_if;

import java.util.Scanner;

public class Number2753 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		
		
		if(((score%4) == 0 && score%100 != 0) || (score%400) == 0)
		{
			System.out.println("윤년입니다.");
		}
		else
		{
			System.out.println("윤년이 아닙니다.");
		}
		input.close();
	}

}
