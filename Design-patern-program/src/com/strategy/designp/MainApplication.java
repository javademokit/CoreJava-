package com.strategy.designp;

import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {

		Context context = new Context();
		int a = 10;
		int b = 5;
		System.out.println("enter no between 1-4 to perform operation: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			context.setStrategy(new ConcreteStrategyAddition());
			System.out.println(context.executeStrategy(a, b));
			break;
		case 2:
			context.setStrategy(new ConcreteStrategySubstraction());
			System.out.println(context.executeStrategy(a, b));
			break;
		case 3:
			context.setStrategy(new ConcreteStrategyMultiplication());
			System.out.println(context.executeStrategy(a, b));
			break;
		case 4:
			context.setStrategy(new ConcreteStrategyDivision());
			System.out.println(context.executeStrategy(a, b));
			break;
		default:
			System.out.println("please enter a valid number");
			break;

		}

		sc.close();

	}

}
