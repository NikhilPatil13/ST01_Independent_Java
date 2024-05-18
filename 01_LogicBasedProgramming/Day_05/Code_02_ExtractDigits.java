/**
 * Extract digits from the number
 * 
 * Implement a program to extract digits from the given number.
 * 
 * input --------> a number from user
 * constraints --> n>0
 * output -------> print digits in the line seperated by space
 * 
 * 
 * -------------------------------------------------------------------------
 * Solution (Logic) -->
 * 
 * read number from user
 * 
 * if number>0
 * 	while number!=0
 * 		reqNumber = number%10
 * 		print reqNumber
 * 
 * 		number = number/10
 * 
 * 
 * input = 123
 * output = 3 2 1
 * 
 * NOTE :
 * ------
 * if we want to keep order of digits then use ArrayList and add reqNumber into it
 * to print use for loop starting from le = list.size()-1 to 0
 * 		list.get(le)
 * 
 * 
 * */
import java.util.Scanner;

public class Code_02_ExtractDigits{

	public void extractDigitsFromNumber(int number){

		if(number>0){

			System.out.print("Extracted : ");

			while(number!=0){
				int requiredNumber = number%10;

				System.out.print(requiredNumber+" ");

				number = number/10;
			}
		}
		else{
			System.out.println("Please enter a positive number...");
		}


	}


	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		Code_02_ExtractDigits code_02_ExtractDigits = new Code_02_ExtractDigits();

		System.out.print("Enter a number : ");
		int number = input.nextInt();

		code_02_ExtractDigits.extractDigitsFromNumber(number);

	}

}
