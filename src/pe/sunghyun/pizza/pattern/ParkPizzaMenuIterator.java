package pe.sunghyun.pizza.pattern;

import java.util.List;

public class ParkPizzaMenuIterator implements Iterator {

	List mPizzas;
	int mPosition;

	public ParkPizzaMenuIterator(List pizzas) {
		this.mPizzas = pizzas;
	}

	@Override
	public boolean hasNext() {
		return this.mPosition < this.mPizzas.size();
	}

	@Override
	public Object next() {
		return this.mPizzas.get(this.mPosition ++);
	}

}
