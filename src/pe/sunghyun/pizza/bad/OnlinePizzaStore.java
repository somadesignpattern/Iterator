package pe.sunghyun.pizza.bad;

import java.util.List;

import pe.sunghyun.pizza.common.Pizza;

public class OnlinePizzaStore {
	private HwangPizzaStore mHwangPizzaStore;
	private ParkPizzaStore mParkPizzaStore;

	public OnlinePizzaStore() {
		this.mHwangPizzaStore = new HwangPizzaStore();
		this.mParkPizzaStore = new ParkPizzaStore();
	}

	public void printMenu() {
		Pizza[] hwangPizzas = this.mHwangPizzaStore.getPizzas();
		final int hwangPizzasLength = hwangPizzas.length;

		System.out.println("------ Hwang Pizza Store ------");

		for(int i = 0; i < hwangPizzasLength; i ++) {
			if(hwangPizzas[i] != null) {
				System.out.println(hwangPizzas[i]);
			}
		}

		System.out.println("------ Park Pizza Store ------");

		List parkPizzas = this.mParkPizzaStore.getPizzas();
		final int parkPizzasLength = parkPizzas.size();

		for(int i = 0; i < parkPizzasLength; i ++) {
			System.out.println(parkPizzas.get(i));
		}
	}
}
