/**
 * For each of the 6 coffee cups I nuy, Iget a 7th cup free. In total, I get 7 cups.
 * Implement a program that takes n cups bough and print as an integer the total
 * number of cups i would get.
 * 
 * input --------> n number of cups from user
 * constraints --> n>0
 * output -------> number of cups present have
 * 
 * 
 * ---------------------------------------------------------------------------------
 * Solution(Logic) -->
 * 
 * 
 * read cups from users he want to purchase
 * 
 * if cups>0
 * 	freeCups = cups/6 
 * 
 * 	totalCups = freeCups+cups
 * 	
 * 	print totalCups
 *  
 * else
 * 	print at least purchase one cup
 * 
 * */

 import java.util.Scanner;

 public class Code_01_FreeCoffeeCup{

 	public void calculateTotalCoffee(int purchasedCups){

 		if(purchasedCups>0){
	 		int freeCups =  purchasedCups/6;

	 		int totalCups = purchasedCups+freeCups;

	 		System.out.println("He will get total "+totalCups+" coffee.");
 		}
 		else{
 			System.out.println("At least purchase one cup coffee.");
 		}
 	}


 	public static void main(String [] args){

 		Scanner input = new Scanner(System.in);

 		System.out.print("Enter coffee cups want to purchase : ");
 		int purchasedCups = input.nextInt();

 		Code_01_FreeCoffeeCup code_01_FreeCoffeeCup = new Code_01_FreeCoffeeCup();

 		code_01_FreeCoffeeCup.calculateTotalCoffee(purchasedCups);

 	}

 }