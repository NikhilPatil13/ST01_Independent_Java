/**
 * Sum of even digits
 * 
 * Implement a program to calculate sum of digits present in the given number
 * 
 * 
 * input --------> a number from user
 * constraints --> n>0
 * output -------> print sum of even digits
 * 
 * 
 * -------------------------------------------------------------------------
 * Solution(Logic) -->
 * 
 * read n number from user
 * 
 * if number>0
 * 	sum=0
 * 	while(number!=0)
 * 		digit = number%10
 * 		
 * 		if(digit%2==0)
 * 			sum=sum+digit
 * 		
 * 		number=number/10
 *	print sum
 * 
 * */
import java.util.Scanner;

public class Code_02_SumOfEvenDigits{

	public void doSumOfEvenDigits(int number){

		if(number>0){
			int sum=0;

			System.out.print("Even digits are : ");
			while(number!=0){
				int digit = number%10;
				if(digit%2==0){
					System.out.print(digit+" ");
					sum = sum+digit;
				}

				number = number/10;

			}
			System.out.println("\nSum of even numbers : "+sum);

		}
		else{
			System.out.println("Please enter a positive number...");
		}

	}


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Code_02_SumOfEvenDigits code_02_SumOfEvenDigits = new Code_02_SumOfEvenDigits();

		System.out.print("Enter a number : ");
		int number = input.nextInt();

		code_02_SumOfEvenDigits.doSumOfEvenDigits(number);

	}

}
