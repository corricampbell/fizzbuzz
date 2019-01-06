package fizzbuzz;

import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		FizzBuzz myFizzBuzzGame = new FizzBuzz();
		System.out.println("Welcome to Fizz Buzz");
		System.out.println("Enter a non-zero number and get a response.");
		int number = input.nextInt();
		
		System.out.println(myFizzBuzzGame.response(number));
		input.close();
		
	}

}
