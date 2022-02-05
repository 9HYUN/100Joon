package stage5_array;

import java.util.Scanner;

public class Number8958 {
	
	public static void main(String[] args) 
	{
		Scanner oxQuiz = new Scanner(System.in);
		int number = oxQuiz.nextInt();
		
		String answer[] = new String[number];
		
		for (int i = 0; i< answer.length; i++)
		{
			answer[i] = oxQuiz.next();
		}
		oxQuiz.close();
		
		for (int j = 0; j < answer.length; j++)
		{
			int cnt = 0;
			int sum = 0;
			for (int k = 0; k < answer[j].length(); k++)
			{
				if(answer[j].charAt(k) == 'O')
				{
					cnt++;
				}
				else 
				{
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}

}
