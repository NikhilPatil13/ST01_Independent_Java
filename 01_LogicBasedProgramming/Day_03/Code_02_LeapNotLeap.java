/**
 * To check whether the given year year is leap year or not.
 * 
 * 
 * input --------> year from user
 * constraint ---> no constraint
 * output -------> leap year or not a leap year
 * 
 * ---------------------------------------------------------------------
 * 
 * Solution(Logic) -->
 * 
 * read integer year from user
 * 
 * if (year%4==0 and year%100!=0) or (year%400==0)
 * 	leap year
 * else
 * 	not a leap year
 * 
 * */

import java.util.Scanner;

 public class Code_02_LeapNotLeap{

 	public void checkLeapYearOrNot(int year){

 		if((year%4==0 && year%100!=0) || (year%400==0)){
 			System.out.println(year+" is a leap year.");
 		}
 		else{
 			System.out.println(year+" is not a leap year.");
 		}
 	}

 	public static void main(String[] args){

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter a year : ");
 		int year = input.nextInt();

 		Code_02_LeapNotLeap code_02_LeapNotLeap = new Code_02_LeapNotLeap();

 		code_02_LeapNotLeap.checkLeapYearOrNot(year);
 	}
 }


