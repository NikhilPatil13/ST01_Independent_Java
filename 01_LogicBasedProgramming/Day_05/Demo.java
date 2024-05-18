import java.util.*;

public class Demo{
	


	public void extractDigitsFromNumber(int number){
		ArrayList list = new ArrayList();
		
		if(number>0){

			System.out.print("Extracted : ");

			while(number!=0){
				int requiredNumber = number%10;

				list.add(requiredNumber);
					
				number = number/10;
			}

			for(int le = (list.size())-1 ; le>=0 ; le--){

				System.out.println(list[le]);

			}

		}
		else{
			System.out.println("Please enter a positive number...");
		}


	}


	public static void main(String[] args){

		Scanner input = new Scanner(System.in);


		Demo demo = new Demo();

		System.out.print("Enter a number: ");
		int number = input.nextInt();


		demo.extractDigitsFromNumber(number);

	}

}