package com.info.beans;

public abstract  class PizzaStore {

	protected abstract Pizza createPizza(String type);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
	    pizza.prepare();
	    pizza.serve();
		return pizza;
		
	}
	
}
