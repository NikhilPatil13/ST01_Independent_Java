/**
 * Sum of digits
 * 
 * Implement a program to calculate sum of digits present in the given number
 * 
 * 
 * input --------> a number from the user
 * constraint ---> n>0
 * output -------> print sum of the digits
 * 
 * 
 * ----------------------------------------------------------------------
 * 
 * Solution(Logic) -->
 * 
 * 
 * read a number from user
 * 
 * if number>0
 * 	sum=0
 * 	while number!=0
 * 		sum = sum+(number%10);
 * 		number = number/10;	
 * 	print sum	
 * */
import java.util.Scanner;

 public class Code_01_SumOfDigits{

 	public void doSumOfDigits(int number){

 		if(number>0){
 			int sum=0;
 			System.out.print("Sum of digits of number : ");
 			while(number!=0){
 				sum = sum+number%10;
 				number = number/10;
 			}
 			System.out.println(sum);
 		}
 		else{
 			System.out.println("Enter a positive number...");
 		}
 	}


 	public static void main(String[] args){
 		Code_01_SumOfDigits code_01_SumOfDigits = new Code_01_SumOfDigits();

 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Enter a number : ");
 		int number = input.nextInt();

 		code_01_SumOfDigits.doSumOfDigits(number);

	 }

 }


