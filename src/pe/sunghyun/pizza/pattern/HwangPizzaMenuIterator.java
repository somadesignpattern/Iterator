package pe.sunghyun.pizza.pattern;

import pe.sunghyun.pizza.common.Pizza;

public class HwangPizzaMenuIterator implements Iterator {

	Pizza[] mPizzas;
	int mPosition = 0;

	public HwangPizzaMenuIterator(Pizza[] pizzas) {
		this.mPizzas = pizzas;
	}

	@Override
	public boolean hasNext() {

		if (this.mPosition >= this.mPizzas.length || this.mPizzas[this.mPosition] == null) {
			return false;
		}

		return true;
	}

	@Override
	public Object next() {
		Pizza pizza = this.mPizzas[this.mPosition ++];
		return pizza;
	}

}
