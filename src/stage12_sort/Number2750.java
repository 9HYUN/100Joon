package stage12_sort;

import java.util.Scanner;
import java.util.Arrays;
 
public class Number2750 {
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in);
		
		int Number = input.nextInt();
		int[] arr = new int[Number];
		
		for(int i = 0; i < Number; i++) {
			arr[i] = input.nextInt();
		}
 
		Arrays.sort(arr);
		
		for(int value : arr) {
			System.out.println(value);
			
		}
 
	}
}