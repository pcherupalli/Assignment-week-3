package com.info.beans;

public class Veggies extends Pizza {

	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
       System.out.println("Start preparing the Cheese pizza");
	}

	@Override
	protected void serve() {
		// TODO Auto-generated method stub
      System.out.println("Serve Chesse pizza to customer ");
	}

}
