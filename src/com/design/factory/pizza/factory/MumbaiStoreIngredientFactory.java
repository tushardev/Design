package com.design.factory.pizza.factory;


import com.design.factory.pizza.ingrediants.*;

public class MumbaiStoreIngredientFactory implements IngredientFactory {

	public Souce createSouce() {
		return new PestoSouce();
	}

	public Topping createTopping() {
		return new CapcicumTopping();
	}

	public Base createBase() {
		return new MaidaaBase();
	}

}
