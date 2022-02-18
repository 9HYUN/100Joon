package stage12_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Number1181 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		
		String[] arr = new String[count];
		
		input.nextLine();
		
		
		for (int i = 0; i < count; i++)
		{
			arr[i] = input.nextLine();
		}

		Arrays.sort(arr, new Comparator<String>()
		{
			public int compare(String s1, String s2)
			{
				if (s1.length() == s2.length())
				{
					return s1.compareTo(s2);
				}
				else
				{
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(arr[0]);
		for(int i = 1; i < count; i++)
		{
			if(!arr[i].equals(arr[i-1]))
			{
				System.out.println(arr[i]);
			}
		}
	}

}
