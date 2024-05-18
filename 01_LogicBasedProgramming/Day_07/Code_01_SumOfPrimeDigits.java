/**
 * Sum of prime digits.
 * 
 * Implement a program to calculate sum of prime digits present in the given number.
 * 
 * 
 * input ---------> a number from the user
 * constraints ---> n>0
 * output --------> print the sum of prime digits
 * 
 * 
 * ---------------------------------------------------------------------------------
 * Solution(Logic) -->
 * 
 * read number from user
 * 
 * if number > 0
 * 	sum=0
 * 	while number!=0
 * 		digit = number%10
 * 	
 * 		if digit==2 or digit==3 or digit==5 or digit==7
 * 			sum= sum+digit
 * 		
 * 		number = number/10
 * 	print sum	 
 * 
 * 
 * 
 * NOTE :
 * ------
 * 	Here we are calculating digits(either asel kiwa nasel) not numbers.
 * 	And hence we taken prime numbers between 0 to 9
 * 
 * */
import java.util.Scanner;

public class Code_01_SumOfPrimeDigits{

	public void doSumOfPrimeDigits(int number){
		if(number>0){
			int sum = 0;
				
			System.out.print("Prime digits are : ");
			while(number!=0){
				int digit = number%10;

				if(digit==2 || digit==3 || digit==5 || digit==7){
					sum=sum+digit;
					System.out.print(digit+" ");
				}

				number=number/10;
			}
			System.out.print("\nThe sum of prime digits is : "+sum);
		}
		else{
			System.out.println("Please enter a positive number...");
		}
	}

	public static void main(String[] args){

		Code_01_SumOfPrimeDigits code_01_SumOfPrimeDigits =  new Code_01_SumOfPrimeDigits();

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int number = input.nextInt();

		code_01_SumOfPrimeDigits.doSumOfPrimeDigits(number);

	}

}