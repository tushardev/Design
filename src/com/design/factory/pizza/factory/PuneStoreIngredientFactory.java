package com.design.factory.pizza.factory;


import com.design.factory.pizza.ingrediants.*;

public class PuneStoreIngredientFactory implements IngredientFactory {

	public Souce createSouce() {
		return new TomatoSouce();
	}

	public Topping createTopping() {
		return new ChillyTopping();
	}

	public Base createBase() {
		return new WheatBase();
	}

}
