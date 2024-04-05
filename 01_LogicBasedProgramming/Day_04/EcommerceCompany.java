/**
 * The e-commerce company Bookshelf wishes to analyse its monthly sales data between 
 * minimum range 30 to max 100. The company has catagorised these book sales
 * into four groups depending upon the number of sales with the help of these
 * groups the company will know which stock they should increase or decrease in
 * their inventory for the next month. The groups are as follows :
 * 	
 * Sales_Range	Groups
 * 30-50		D
 * 51-60		C
 * 61-80		B
 * 81-100		A
 * 
 * input -------> an integer salesCount represent total sales of a book
 * constraint --> 30<=saleCount<=100
 * output ------> a character representing the group of a given saleCount
 * 
 * -----------------------------------------------------------------------------
 * Solution(Logic) -->
 * 
 * read int saleCount from user
 * 
 * if saleCount>=30 and saleCount<=100
 * 	if saleCount>=30 and saleCount<=50
 * 		print D
 * 	else if saleCount>=51 and saleCount<=60
 * 		print C
 * 	else if saleCount>=61 and saleCount<=80
 * 		print B
 * 	else if saleCount>=81 and saleCount<=100
 * 		print A
 * else
 * 		print invalid
 * 
 * */

import java.util.Scanner;

 public class Code_01_EcommerceCompany{

 	public void analyzeSales(int saleCount){

 		if(saleCount>=30 && saleCount<=100){
			if(saleCount>=30 && saleCount<=50){
	 			System.out.println("D");
	 		}
	 		else if(saleCount>=51 && saleCount<=60){
	 			System.out.println("C");
	 		}
	 		else if(saleCount>=61 && saleCount<=80){
	 			System.out.println("B");
	 		}
	 		else if(saleCount>=81 && saleCount<=100) {
	 			System.out.println("A");
	 		}
 		}
 		else{
 			System.out.println("Invalid...");
 		}
 	}


 	public static void main(String[] args){

 		EcommerceCompany ecommerceCompany =  new EcommerceCompany();

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter sale Count :");
 		int saleCount = input.nextInt();

 		ecommerceCompany.analyzeSales(saleCount);

 	}


 }