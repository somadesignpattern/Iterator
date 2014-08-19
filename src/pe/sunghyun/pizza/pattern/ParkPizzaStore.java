package pe.sunghyun.pizza.pattern;

import java.util.ArrayList;
import java.util.List;

import pe.sunghyun.pizza.common.Pizza;

public class ParkPizzaStore {
	private List mPizzas;

	public ParkPizzaStore() {
		this.mPizzas = new ArrayList();
		this.addItem("Shrimp Pizza", 5.8d);
		this.addItem("Egg Pizza", 2.1d);
		this.addItem("Golden Pizza", 4.3d);
		this.addItem("Ham Pizza", 3.5d);
	}

	public void addItem(String name, double price) {
		Pizza pizza = new Pizza(name, price);
		this.mPizzas.add(pizza);
	}

	public Iterator createIterator() {
		return new ParkPizzaMenuIterator(this.mPizzas);
	}
}