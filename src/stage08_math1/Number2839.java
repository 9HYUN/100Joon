package stage08_math1;

import java.util.Scanner;

public class Number2839 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kg = input.nextInt();
		int totalCount = 0;
		
		while(true)
		{
			if(kg%5 == 0 )
			{
				totalCount += kg / 5;
				break;
			}
			else if(kg < 0)
			{
				totalCount = -1;
				break;
			}
			else
			{
				kg -= 3;
				totalCount++;
			}
			
			
		}
		System.out.println(totalCount);
	}

}
