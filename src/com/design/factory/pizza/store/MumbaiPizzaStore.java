package com.design.factory.pizza.store;


import com.design.factory.pizza.CheesePizza;
import com.design.factory.pizza.MaxicanPizza;
import com.design.factory.pizza.Pizza;
import com.design.factory.pizza.factory.IngredientFactory;
import com.design.factory.pizza.factory.MumbaiStoreIngredientFactory;

public class MumbaiPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		IngredientFactory ingrFactory = new MumbaiStoreIngredientFactory();
		
		if(type.equals("cheese")) {
			pizza = new CheesePizza(ingrFactory);
			pizza.setName("Mumbai Cheese Pizza");
		} else if(type.equals("maxican")) {
			pizza = new MaxicanPizza(ingrFactory);
			pizza.setName("Mumbai Maxican Pizza");
		}
		
		return pizza;
	}
}
