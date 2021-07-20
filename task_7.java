package standardeviation_program;

import java.util.Scanner;

public class StandardDeviation {
	
	 static void main(String args[]) 
	    { 
		// read an  interactive  input 
		
		Scanner sc=new Scanner(System.in);  
		//input a number 
		System.out.println("enter a number"); 
		//input a number 
		int n=sc.nextInt();// store the input value in n
		double[] input=new double[n]; //
		//declare and initialize sum, mean variable
		double sum=0,mean; // create a type double 
		//enter each o the element 
		System.out.println("enter n elements");	
		sc.close();
		for(int i=0;i<n;i++) 
		{
			input[i]=sc.nextDouble();
			sum=sum+input[i];
		}
	       	mean=sum/n;
	       	System.out.println("Mean :"+mean);
		sum=0;  
		for(int i=0;i<n;i++) 
		{
			sum+=Math.pow((input[i]-mean),2);
		}
	    
		mean=sum/(n-1);
		double deviation=Math.sqrt(mean);
		System.out.println("standard deviation :"+deviation);
	    }
}
	   
