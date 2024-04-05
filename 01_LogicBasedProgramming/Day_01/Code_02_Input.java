/**
* It a source code to take input for 2 integers from user ,do addition and  print on console.
*
* BufferedReader(C) -----> java.io -----> char  and String
* Console(C) ------------> java.io -----> String and Password
* Scanner(C) ------------> java.util ---> All datatypes
*/

import java.util.Scanner;

public class Code_02_Input{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int number1 , number2 , result;
		
		System.out.print("Enter number1 : ");
		number1 = input.nextInt();

		System.out.print("Enter number2 : ");
		number2 = input.nextInt();
		
		result = number1 + number2;
		
		System.out.println(number1+ " + "+number2+" = "+result);
		
	}
	
}