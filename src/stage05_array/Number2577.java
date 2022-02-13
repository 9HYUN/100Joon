package stage05_array;

import java.util.Scanner;

public class Number2577 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		input.close();
		int number[] = new int[10];
		int result = A*B*C;
		
		while(result > 0)
		{
			number[result%10]++;
			result /= 10;
		}
		for(int i=0; i<10;i++)
		{
			System.out.println(number[i]);
		}
	}

}
