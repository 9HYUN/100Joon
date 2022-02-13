
package stage04_while;

import java.util.Scanner;

public class Number10952 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A;
		int B;
		while(true)
		{
			A = input.nextInt();
			B = input.nextInt();
			
			if (A == 0 && B == 0)
			{
				input.close();
				break;
			}
			System.out.println(A+B);
		}
	}

}
