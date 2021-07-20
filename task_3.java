package prime_number;

import java.util.Scanner;
//import java.util.Scanner.*;

public class Array_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of the array   "); // input the size of the value 
		int size= in.nextInt();
		//System.out.println("Enter the size of the Array:");
		
		System.out.println("Enter the array elements"); // i create a new array to store elements
		int a[] = new int[size];
		
		for (int i= 0; i<size; i++) { //loop through each of the element 
			a[i]= in.nextInt(); // store the number that you input 
			}
		System.out.println("The array element are:  ");
		for (int i = 0; i<size; i++) {
			System.out.print(a[i]+ " ");
			}
		System.out.println("\nprime numbers in the array  are ");
		for (int i = 0; i<size; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("\nprime number in the array are ");
		for (int i=0; i<size; i++) {
			int count =0;
			for (int j=2; j<a[i]-1; j++) {
				if(a[i]%j ==0 ) {
					count =count +1 ;
				}
			}
			if(count ==0 ) {
				System.out.print(a[i]+ "  ");
			}
		}
		
in.close();
	}

	}
