package pe.sunghyun.pizza.bad;

import pe.sunghyun.pizza.common.Pizza;

public class HwangPizzaStore {
	public static final int MAX_NUMBER_OF_PIZZAS = 6;

	private Pizza[] mPizzas;
	private int mNumberOfPizzas = 0;

	public HwangPizzaStore() {
		this.mPizzas = new Pizza[MAX_NUMBER_OF_PIZZAS];
		this.addItem("Bulgogi Pizza", 4.0d);
		this.addItem("Cheese Pizza", 2.5d);
		this.addItem("Salad Pizza", 3.7d);
		this.addItem("Potato Pizza", 4.2d);
	}

	public void addItem(String name, double price) {
		Pizza pizza = new Pizza(name, price);
		if (this.mNumberOfPizzas >= MAX_NUMBER_OF_PIZZAS) {
			System.out.println("Sorry, but the menu is full.");
		}
		else {
			this.mPizzas[this.mNumberOfPizzas ++] = pizza;
		}
	}

	public Pizza[] getPizzas() {
		return this.mPizzas;
	}
}
