package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the max number you want to test: ");
		int n = in.nextInt();

		int numbers[] = new int[n];

		for (int i = 0; i < n-1; i++)
		{
			numbers[i] = i+2;			
		} 
		for (int i = 0; i < n-1; i++)
		{
			if (numbers[i] != 0)
			{
				for (int j = (i +1) ; j < n - 1; j++ )
				{
					if (numbers[j] % numbers[i] != 0)
					{
						numbers[j] = 0;
					}
				}
			}
		}
		for (int x = 0; x < n - 1 ; x++)
		{
			if (numbers[x] != 0)
			{
				System.out.println(numbers[x]);
			}
		}
	}

}
