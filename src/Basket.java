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
	}

	int getSize() {
		return productList.size();
	}

	public void listProducts() {

		for (Product item : productList)

			System.out.println(item.getIndex() + " " + item.getName() + " "
					+ item.getPrice());
	}
}