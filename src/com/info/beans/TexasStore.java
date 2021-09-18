package com.info.beans;

public class TexasStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(type.equals("Cheese")) {
			pizza = new Chesse();
		}
		else if(type.equals("veggies")) {
			pizza = new Veggies();
		}
		return pizza;
	}

}
