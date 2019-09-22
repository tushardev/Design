package com.design.factory.pizza.factory;

/* This is abstract class for creating ingredients */

import com.design.factory.pizza.ingrediants.Base;
import com.design.factory.pizza.ingrediants.Souce;
import com.design.factory.pizza.ingrediants.Topping;

public interface IngredientFactory {
	
	public Souce createSouce();
	
	public Topping createTopping();
	
	public Base createBase();

}
