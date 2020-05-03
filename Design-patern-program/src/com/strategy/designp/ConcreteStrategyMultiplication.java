package com.strategy.designp;

public class ConcreteStrategyMultiplication implements Strategy {

	@Override
	public long execute(int a, int b) {
		return a * b;
	}
}
