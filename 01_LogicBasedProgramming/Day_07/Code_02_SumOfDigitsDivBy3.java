/**
 * Sum of digits divisible by 3
 * 
 * Implement a program to calculate sum of digits that are divisible by 3 in the given number
 * 
 * 
 * input --------> a number from user
 * constraints --> n>0
 * output -------> print the sum of digits that are divisible by 3
 *
 * 
 * --------------------------------------------------------------------------------------------
 * Solution(Logic) -->
 * 
 * read a number from user
 * 
 * if number>0
 * 	sum=0
 * 	while number!=0
 * 		digit = number%10;
 * 
 * 		if (digit%3)==0
 * 			sum=sum+digit
 *  
 * 		number = number/10
 * 	print sum 
 * */
import java.util.Scanner;

public class Code_02_SumOfDigitsDivBy3{


	public void doSumOfDigitsDivisibleBy3(int number){

		if(number>0){

			int sum=0;
			System.out.print("Digits divisible by 3 : ");
			while(number!=0){

				int digit = number%10;

				if(digit%3 == 0){
					System.out.print(digit+" ");

					sum = sum+digit;
				}

				number = number/10;
			}

			System.out.println("\nSum of digits/3 = "+sum);
		}

	}


	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int number = input.nextInt();


		Code_02_SumOfDigitsDivBy3 code_02_SumOfDigitsDivBy3 = new Code_02_SumOfDigitsDivBy3();

		code_02_SumOfDigitsDivBy3.doSumOfDigitsDivisibleBy3(number);


	}
}


