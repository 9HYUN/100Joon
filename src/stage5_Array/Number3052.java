package stage5_Array;

import java.util.HashSet;
import java.util.Scanner;

public class Number3052 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashSet<Integer> hash = new HashSet<Integer>();
		for (int i = 0; i <10; i++)
		{
			hash.add(input.nextInt() % 42);
		}
		input.close();
		
		System.out.println(hash.size());
		
	}

}
