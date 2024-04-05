/**
 * Program to check given number is Even or Odd
 * 
 * 
 * input --------> an integer number n
 * constraint ---> n>=0
 * output -------> even or odd or invalid
 * 
 * -------------------------------------------------------
 * 
 * Solution (Logic) -->
 * 	read n value
 * 
 * 	if n>=0
 * 		if n%2==0
 * 			even
 * 		else
 * 			odd
 * else
 * 		invalid
 * 
 * */

import java.util.Scanner;

 public class Code_01_EvenOdd{

 	public void checkEvenOrOdd(int number){

 		if(number>=0){
 			if(number%2==0){
 				System.out.println(number+" is an even number.");
 			}
 			else if(number%2!=0){
 				System.out.println(number+" is an odd number.");
 			}
 		}
 		else{
 			System.out.println("Invalid Input...");
 		}
 	}

 	public static void main(String[] args){

 		Code_01_EvenOdd code_01_EvenOdd = new Code_01_EvenOdd();

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter a number : ");
 		int number  = input.nextInt();

 		code_01_EvenOdd.checkEvenOrOdd(number);

 	}


 }