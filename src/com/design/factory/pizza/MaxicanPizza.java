package com.design.factory.pizza;

/* This is concrete subclass of Product Pizza */

import com.design.factory.pizza.factory.IngredientFactory;

public class MaxicanPizza extends Pizza {
	
	IngredientFactory ingridentfactory;
	
	public MaxicanPizza(IngredientFactory ingridentfactory) {
		this.ingridentfactory = ingridentfactory;
	}

	@Override
	public void prepare() {
		
		souce = ingridentfactory.createSouce();
		
		topping = ingridentfactory.createTopping();
		
		base = ingridentfactory.createBase();
	}
	
	

}
