/**
 * Return the next number from the integer passed.
 * 
 * Implement a program that takes a number as an argument, increments the number
 * +1 and return the result.
 * 
 * 
 * input --------> a number from user
 * constraints --> no constraints
 * output -------> an incremented value
 * 
 * ----------------------------------------------------------------------------
 * Solution(Logic) -->
 * 
 * read a int number from user
 * 
 * print n+1 (or) ++n
 *  
 *  
 * */

import java.util.Scanner;

 public class Code_02_ReturnNumber{

 	public int returnNumberAfterIncrementing(int number){
 		return ++number;
 	}


 	public static void main(String[] args){

 		ReturnNumber returnNumber = new ReturnNumber();

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter an integer number : ");
 		int number = input.nextInt();

 		int afterIncrementing = returnNumber.returnNumberAfterIncrementing(number);

 		System.out.println("After Incrementing : "+afterIncrementing);

 	}

 }