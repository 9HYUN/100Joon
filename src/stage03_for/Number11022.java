package stage03_for;

import java.util.Scanner;

public class Number11022 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for(int j = 1; j<= number; j++)
		{
			int A = input.nextInt();
			int B = input.nextInt();
			
			System.out.println("Case #"+ j +": "+ A +" + "+ B +" = "+ (A+B));
		}
		input.close();
		
	}

}
