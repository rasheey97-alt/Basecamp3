package numof3Apear;
import java.util.*;
public class num3Appear {
	
	
	// Java program to find the number of times digit 3 occurs in each and every number from 0 to n
	
	static int count_3s(int n)
		{
			int count = 0;
			while (n > 0)
				{
					if (n % 10 == 3)
						{
							count++;
						}
			n = n / 10;
				}
			return count;
		}

		static int count_in_range(int n)
		{
		int count = 0 ;
		for (int i = 2; i <= n; i++)
			{
				count += count_3s(i);
			}
		return count;
		}

		public static void main(String[] args)
			{
			int number;
			Scanner sc = new Scanner(System.in);
			System.out.print("nEnter the number :");
			number = sc.nextInt();
			System.out.print(count_in_range(number));
			sc.close();
			}
	}


