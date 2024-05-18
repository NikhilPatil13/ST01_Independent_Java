/**
 * Number of digits.
 * 
 * Implement a program to calculate number of digits in the given number.
 * 
 * input ---------> a number from the user
 * constraints ---> n>0
 * output --------> print the number of digits in the number
 * 
 * ------------------------------------------------------------------------
 * Solution(Logic) -->
 * 
 * read a number from user
 * 
 * if number>0
 * 	count=0
 * 	while number!=0
 * 		digit = number%10
 * 		count++
 * 		number=number/10
 * 	print count
 * */

import java.util.Scanner;

 public class Code_03_NumberOfDigits{

 	public void countDigitsInNumber(int number){
 		if(number>0){
 			int originalNumber = number;
 			int count=0;
 			while(number!=0){
 				int digit=number%10;
 				count++;
 				number=number/10;
 			}
 			System.out.println("Number of digits in "+originalNumber+" are : "+count);
 		}
 	}


 	public static void main(String[] args){
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Enter a number : ");
 		int number = input.nextInt();

 		Code_03_NumberOfDigits code_03_NumberOfDigits =  new Code_03_NumberOfDigits();

 		code_03_NumberOfDigits.countDigitsInNumber(number);

 	}

 }
 