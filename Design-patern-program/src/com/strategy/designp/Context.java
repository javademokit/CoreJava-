package com.strategy.designp;

public class Context {
	
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public long executeStrategy(int a, int b) {
		return strategy.execute(a, b);
	}
}
