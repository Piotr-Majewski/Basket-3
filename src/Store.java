import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		Store myStore = new Store();
		myStore.init();

	}

	public void init() {

		Scanner input = new Scanner(System.in);
		Basket standardList = new Basket();

		while (true) {

			System.out
					.println("Type 'add' to add new product, 'del' to delete, 'total' gain total amount or 'end' to print reciept");

			String inputCommand = input.next();

			if (inputCommand.equals("add")) {

				String inputName = input.next();
				double inputPrice = input.nextDouble();
				standardList.addProduct(new Product(standardList.getSize(),
						inputName, inputPrice));

				System.out.println(standardList.getSize());
			}

			if (inputCommand.equals("del")) {
				int inputIndex = input.nextInt();
				standardList.delProduct(inputIndex);
			}

			if (inputCommand.equals("total")) {
				listProducts(standardList);
				totalCost(standardList);
			}

			if (inputCommand.equals("end")) {
				listProducts(standardList);
				totalCost(standardList);
				input.close();
				break;
			}
		}
	}

	public void listProducts(Basket someList) {
		for (Product Product : someList.getList()) {
			System.out.println(Product.getIndex() + " " + Product.getName()
					+ " " + Product.getPrice());
		}
	}

	public void totalCost(Basket someList) {
		double price = 0;
		for (Product Product : someList.getList()) {
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
