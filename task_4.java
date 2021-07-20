package passwordValidation;





//Java implementation fo the above approach
import java.io.*;
import java.util.*;

public class passwordstrngth {


	  public static void main(String[] args)
	    {
	        // TODO Auto-generated method stub
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the password   ");
	        String inputPassword = scan.nextLine();
	        
	       /** int uppercase = 0;
	        int lowercase = 0;
	        int specialcharacters = 0;
	        int digits = 0;
	        char[] Password = inputPassword.toCharArray();
	        for (int index = 0; index < inputPassword.length(); index++)
	        {
	            if (Character.isUpperCase(Password[index]))
	            {
	                uppercase = 1;
	            }
	            if (Character.isLowerCase(Password[index]))
	            {
	                lowercase = 1;
	            }
	            if (Character.isDigit(Password[index]))
	            {
	                digits = 1;
	            }
	        }
	        */
	        if (inputPassword.matches ("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*?[#?!@$%^&*-]).(?=.{8,})")){
	            System.out.println("Strong");
	        } else if (inputPassword.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.{8,})")){
	            System.out.println("Medium");
	        } else if (inputPassword.matches("^(?=.*[a-z])(?=.*[0-9])(?=.{8,})")){
	            System.out.println("Weak");
	        } else if (inputPassword.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.{8,})")){
	            System.out.println("Weak");
	        } // etc
	    }
}