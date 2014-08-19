package pe.sunghyun.pizza.pattern;

import pe.sunghyun.pizza.common.Pizza;


public class OnlinePizzaStore {
	private HwangPizzaStore mHwangPizzaStore;
	private ParkPizzaStore mParkPizzaStore;

	public OnlinePizzaStore() {
		this.mHwangPizzaStore = new HwangPizzaStore();
		this.mParkPizzaStore = new ParkPizzaStore();
	}

	public void printMenu() {
		System.out.println("------ Hwang Pizza Store ------");
		this.printMenu(this.mHwangPizzaStore.createIterator());
		System.out.println("------ Park Pizza Store ------");
		this.printMenu(this.mParkPizzaStore.createIterator());
	}

	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			Pizza pizza = (Pizza)iterator.next();
			System.out.println(pizza);
		}
	}
}

