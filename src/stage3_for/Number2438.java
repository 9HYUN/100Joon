package stage3_for;

import java.util.Scanner;

public class Number2438 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int line = input.nextInt();
		input.close();
		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
