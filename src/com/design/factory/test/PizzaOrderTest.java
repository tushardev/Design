package com.design.factory.test;


import com.design.factory.pizza.Pizza;
import com.design.factory.pizza.store.MumbaiPizzaStore;
import com.design.factory.pizza.store.PizzaStore;
import com.design.factory.pizza.store.PunePizzaStore;

public class PizzaOrderTest {

	public static void main(String[] args) {
		
		/* Order Pizza from Pune */
		
		PizzaStore pizzaStorePun = new PunePizzaStore();
		
		Pizza pizzaPunC = pizzaStorePun.oderPizza("cheese");
		
		System.out.println(pizzaPunC.getName());
		System.out.println(pizzaPunC.getSouce().toString());
		System.out.println(pizzaPunC.getTopping().toString());
		System.out.println("<--------------->");
		
		Pizza pizzaPunM = pizzaStorePun.oderPizza("maxican");
		
		System.out.println(pizzaPunM.getName());
		System.out.println(pizzaPunM.getSouce().toString());
		System.out.println(pizzaPunM.getTopping().toString());
		System.out.println("<--------------->");
		
		/* Order Pizza from Mumbai */
		
		PizzaStore pizzaStoreMum = new MumbaiPizzaStore();
		
		Pizza pizzaMumC = pizzaStoreMum.oderPizza("cheese");
		
		System.out.println(pizzaMumC.getName());
		System.out.println(pizzaMumC.getSouce().toString());
		System.out.println(pizzaMumC.getTopping().toString());
		System.out.println("<--------------->");
		
		Pizza pizzaMumM = pizzaStoreMum.oderPizza("maxican");
		
		System.out.println(pizzaMumM.getName());
		System.out.println(pizzaMumM.getSouce().toString());
		System.out.println(pizzaMumM.getTopping().toString());
	}

}
