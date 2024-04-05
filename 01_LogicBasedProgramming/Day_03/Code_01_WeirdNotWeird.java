/**
 * Given an integer n , perform the following conditional actions,
 * 
 * if n is odd , print Weird
 * if n is even and in the inclusive range of 2 to 5, print Not Weird
 * if n is even and in the inclusive range of 6 to 20, print Weird
 * if n is even and greater than 20, print Not Weird
 * 
 * input -------> a number from user
 * constraint --> 1<=n<=100
 * output ------> Weird or Not Weird
 * 
 * 
 * ---------------------------------------------------------------------
 * 
 * Solution(Logic) -->
 * 
 * 	read n from user
 * 
 * 	if (n%2!=0)
 * 		print Weird
 * 	else
 * 		if(n>=2 and n<=5) or (n>20)
 * 			print Not Weird
 * 		if n>=6 and n<=20 
 * 			print Weird
 * 		
 *  
 * */

import java.util.Scanner;

 public class Code_01_WeirdNotWeird{

 	public void checkWeirdNotWeird(int number){

 		if(number%2!=0){
 			System.out.println("Weird");
 		} 
 		else{
 			if((number>=2 && number<=5) || (number>20)){
 				System.out.println("Not Weird");
 			}
 			else if(number>=6 && number<=20){
 				System.out.println("Weird");
 			}
 		}
 	}


 	public static void main(String[] args){

 		Code_01_WeirdNotWeird code_01_WeirdNotWeird = new Code_01_WeirdNotWeird();

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter a number : ");
 		int number = input.nextInt();

 		code_01_WeirdNotWeird.checkWeirdNotWeird(number);
 	}
 }