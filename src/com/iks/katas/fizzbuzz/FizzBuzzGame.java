package com.iks.katas.fizzbuzz;

public class FizzBuzzGame {

	public static void main(String[] args) {
		FizzBuzzGame fbg = new FizzBuzzGame();

		for (int i = 1; i <= 200; i++)
			System.out.println(fbg.convertToFizzBuzz(i));
	}

	public String convertToFizzBuzz(int input) {
		String output = "";

		if (input % 3 == 0)
			output += "Fizz";

		if (input % 5 == 0)
			output += "Buzz";

		if (input % 7 == 0)
			output += "Whizz";

		if (output == "")
			return "" + input;

		return output;
	}

}
