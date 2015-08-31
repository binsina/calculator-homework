import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			
		Random rand = new Random();
				
		Scanner input = new Scanner (System.in);
		//int input=rand.nextInt(10);
			//for (int i =0;i<3; i++) {					
		int numbertoGuess=rand.nextInt(10);
		int numberofTries =3;
		numberofTries++;
		int guess = 0;
		boolean win = false;
		while (win == false) {
			for (int i =0;i<3; i++) {		
		System.out.println("I am thinking of a number from 1 to 10, you must guess what it is in three tries!");
		guess = input.nextInt();
			
		if (guess == numbertoGuess) {
		win = true;
		System.out.println ("You win!");
		}
		else if  (guess < numbertoGuess) {
		System.out.println("Your getting Colder!!");
		}
		else if (guess > numbertoGuess) {
		System.out.println("your getting hotter!!");
		   }
		}
	
		
		
		System.out.println ("The number was" +" "+ numbertoGuess);
		System.out.println ("It took you " + numberofTries +" " + "tries, the program will start again");
	}
		
}
}	
	
	
	
	

