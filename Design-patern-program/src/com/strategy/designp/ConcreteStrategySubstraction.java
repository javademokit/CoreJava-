package com.strategy.designp;

public class ConcreteStrategySubstraction implements Strategy {

	@Override
	public long execute(int a, int b) {
		return a - b;
	}

}
