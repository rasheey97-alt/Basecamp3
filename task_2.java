import java.util.Scanner;

/**
 * Java program to check  a function that accepts a positive integer and 
 * determines if it is a prime number. The function should return true if it is a prime
 *  number or false if it isn’t.

 * @author Ten-Soft
 *
 */
public class prime_num {

	
		// TODO Auto-generated method stub
		public static boolean checkPrime(int n ) {
			/* 2 to n  
			 * */ 
			for(int i =2; i<n; i++) {
			if (n%i==0) {
				return false; 
				
				
			}
			
			
			}
			return true;
		}
			
			public static void main  (String[] args) {
				
				Scanner in =new Scanner(System.in); 
				 
				
				System.out.println("Enter prime number    ");
				
				int n = in.nextInt();
				
				//System.out.println();
				in.close();
				if(n>=2 && checkPrime(n)) {
					System.out.print(n+"   is a  prime");
				
				} 
				else
					
				{
					System.out.println(n+ "     is not a  prime");
				}
			}
	}


