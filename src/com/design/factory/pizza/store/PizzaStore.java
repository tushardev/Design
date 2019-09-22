package com.design.factory.pizza.store;



/* This is Creator from factory Pattern. End user will give order in Pizza Store */

import com.design.factory.pizza.Pizza;

public abstract class PizzaStore {
	
	/* create Pizza will be implemented by subclass of store depending on location */
	public abstract Pizza createPizza(String type);
	
	public Pizza oderPizza(String pizzaType) {
		Pizza pizza = createPizza(pizzaType);
		pizza.prepare();
		return pizza;
	}
}
