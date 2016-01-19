import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		Store myStore = new Store();
		myStore.init();
	}

	public void init() {

		Scanner input = new Scanner(System.in);
		Basket standardBasket = new Basket();

		outerLoop: while (true) {

			System.out
					.println("Type 'add' to add new product, 'del' to delete, 'total' gain total amount or 'end' to print reciept");

			String inputCommand = input.next();

			switch (inputCommand) {

			case "add":
				String inputName = input.next();
				double inputPrice = input.nextDouble();
				standardBasket.addProduct(new Product(standardBasket.getSize(),
						inputName, inputPrice));
				standardBasket.totalCost();
				System.out.println(standardBasket.getSize());
				break;

			case "del":
				int inputIndex = input.nextInt();
				standardBasket.delProduct(inputIndex);
				break;

			case "total":
				standardBasket.listProducts();
				standardBasket.totalCost();
				break;

			case "end":
				standardBasket.listProducts();
				standardBasket.totalCost();
				input.close();
				break outerLoop;

			}
		}
	}
}