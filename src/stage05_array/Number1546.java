package stage05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Number1546 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		double arr[] = new double[number];
		double fakeArr[] = new double[number];
		for (int i = 0; i < number ; i++)
		{
			arr[i] = input.nextInt();
		}
		double M = Arrays.stream(arr).max().getAsDouble();
		
		for (int i = 0; i< number ; i++)
		{
			fakeArr[i] = arr[i] / M * 100;
		}
		
		double result = Arrays.stream(fakeArr).average().getAsDouble();
		System.out.println(result);
	}

}
