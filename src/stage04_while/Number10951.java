
package stage04_while;

import java.util.Scanner;

public class Number10951 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A;
		int B;
		while(input.hasNextInt())
		{
			A = input.nextInt();
			B = input.nextInt();
			System.out.println(A+B);
		}
	}

}
