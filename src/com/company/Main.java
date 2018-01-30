package com.company;
import java.util.Optional;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.println("pick a number between 1 and 100:");

			input.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println("you did not type a number in. this is our catch block");
		}
		System.out.println("This is after our try catch block");
		Main main = new Main();
		//main.aTestMethod();
		main.optionalsTest();
	}

	private void aTestMethod() throws ArithmeticException {
		System.out.println("What is the numerator you would like to divide?");
		int num1 = input.nextInt();
		System.out.println("What is the denominator you would like to divide?");
		int num2 = input.nextInt();
		input.nextInt();
		System.out.println(divide(num1, num2));

		System.out.println("After our throws");
	}

	private int divide(int a, int b) {

		if (b == 0) {
			throw new ArithmeticException("You can\'t divide by zero!");
		} else {
			return a / b;
		}
	}
	private  void optionalsTest(){
		Integer value1 = null;
		Integer value2 = 10;
		Optional<Integer> a = Optional.ofNullable(value1);
		Optional<Integer> b = Optional.of(value2);
		System.out.println(sum(a, b));

	}

	private int sum (Optional<Integer> a, Optional<Integer> b){

		System.out.println("First parameter is present:" + a.isPresent());
		System.out.println("Second parameter is present:" + b.isPresent());
		Integer value1 = a.orElse(0);
		System.out.println(value1);
		Integer value2 = b.get();
		return value1 + value2;

	}

}
