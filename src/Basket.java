import java.util.ArrayList;
import java.util.List;

public class Basket {

	private static List<Product> productList;

	public Basket() {
		productList = new ArrayList<>();
	}

	public void addProduct(Product item) {
		productList.add(item);
	}

	public void delProduct(int productIndex) {
		productList.remove(productIndex);

		int index = -1;
		for (Product Product : productList) {

			index = index + 1;
			Product.setIndex(index);
		}

	}

	int getSize() {
		return productList.size();
	}

	public void listProducts() {
		for (Product Product : productList) {
			System.out.println(Product.getIndex() + " " + Product.getName()
					+ " " + Product.getPrice());
		}
	}

	public void totalCost() {
		double price = 0;
		for (Product Product : productList) {
			price = price + Product.getPrice();
		}
		if (price <= 200) {
			System.out.println(price);
		}
		if (price > 200) {
			System.out.println(200 + ((price - 200) * 0.9));
			System.out.println("10% discount from amont above 200 counted");
		}
	}
}