package stage05_array;

import java.util.Scanner;

public class Number4344 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int howMany = input.nextInt();
		
		for(int j = 0; j< howMany; j++)
		{
			int count = input.nextInt();
			int numArr[] = new int [count];
			int total = 0;
			int avr = 0;
			float moreThanAvr = 0;
			float percentage = 0;
			
			for(int i = 0; i < count; i++)
			{
				numArr[i] = input.nextInt();
				total += numArr[i];
			}
			
			avr = total/count;
			for(int i = 0; i< count; i++)
			{
				if(numArr[i] > avr)
				{
					moreThanAvr++;
				}
			}
			percentage = (moreThanAvr*100/count);
			System.out.println(String.format("%.3f%%", percentage));
		}
		input.close();
	}

}
