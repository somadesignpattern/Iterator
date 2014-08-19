package pe.sunghyun.pizza.common;

public class Pizza {
	private String mName;
	private double mPrice;

	public Pizza(String name, double price) {
		this.mName = name;
		this.mPrice = price;
	}

	public String getName() {
		return this.mName;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public double getPrice() {
		return this.mPrice;
	}

	public void setPrice(double price) {
		this.mPrice = price;
	}

	@Override
	public String toString() {
		return this.mName + " is " + this.mPrice + "$.";
	}
}
