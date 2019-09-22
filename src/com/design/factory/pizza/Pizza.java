package com.design.factory.pizza;

/* This is abstract class Pizza which represents product Pizza
 * Pizza is having references of abstract classes instead of concrete classes*/


import com.design.factory.pizza.ingrediants.Base;
import com.design.factory.pizza.ingrediants.Souce;
import com.design.factory.pizza.ingrediants.Topping;

public abstract class Pizza {
	
	String name;
	
	Integer price;
	
	Souce souce;
	
	Topping topping;
	
	Base base;
	
	public abstract void prepare();
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Souce getSouce() {
		return souce;
	}

	public void setSouce(Souce souce) {
		this.souce = souce;
	}

	public Topping getTopping() {
		return topping;
	}

	public void setTopping(Topping topping) {
		this.topping = topping;
	}

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}
}
