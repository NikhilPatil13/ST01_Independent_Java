/**
 * Reverse Integer
 * 
 * Given an integer x,return x with its digits reversed.
 * 
 * input ---------> a number from user
 * constraints ---> n>=0
 * output --------> reverse of the given number
 * 
 * ---------------------------------------------------------------------------
 * 
 * Solution(Logic) -->
 * 
 * read a number from user
 * 
 * if number>0
 * 	while number!=0
 * 		digit = number%10
 * 		print digit
 * 		number=number/10
 * 
 * */
import java.util.Scanner;

public class Code_04_ReverseNumber{

	public void doReverseOfNumber(int number){
		if(number>=0){
			while(number!=0){
				int digit = number%10;
				System.out.print(digit);
				number = number/10;
			}
		}
	}

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int number = input.nextInt();

		Code_04_ReverseNumber code_04_ReverseNumber = new Code_04_ReverseNumber();

		code_04_ReverseNumber.doReverseOfNumber(number);


	}

}

