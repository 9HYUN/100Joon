package stage08_math1;

import java.util.Scanner;

public class Number1712 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int gain = 0;
		int goJung = input.nextInt();
		int gaByun = input.nextInt();
		int price = input.nextInt();
		int num = 0;
		
		if(gaByun >= price)
		{
			System.out.println(-1);
		}
		
//		for(int i = 0; gain <= 0; i++)
//		{
//			gain = price * i - (goJung + gaByun*i);
//			num = i;
//		}
		// 이거 쓰니 시간 초과란다;;
		else 
		{
		num =  (goJung/(price-gaByun))+1;
		System.out.println(num);
		}
	}
}
