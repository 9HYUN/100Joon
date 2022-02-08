package stage6_string;

import java.util.Scanner;

public class Number11720 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		String number = input.next();
		
		int sum = 0;
		
		
		for (int i = 0; i < count; i++)
		{
			int changeToInt = number.charAt(i);
			sum += changeToInt-48;
		}
		System.out.println(sum);
	}

}
