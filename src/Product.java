public class Product {

	private String name;
	private double price;
	private int productIndex;

	public Product(int in, String na, double pri) {
		productIndex = in;
		name = na;
		price = pri;
	}

	int getIndex() {
		return productIndex;
	}

	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}

	public void setIndex(int productIndex) {
		this.productIndex = productIndex;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}