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
				System.out.println("Input name of the product you want to add");
				String inputName = input.next();
				System.out
						.println("Input price of the product you want to add");
				double inputPrice = input.nextDouble();
				standardBasket.addProduct(new Product(standardBasket.getSize(),
						inputName, inputPrice));
				standardBasket.totalCost();
				System.out.println(standardBasket.getSize());
				break;

			case "del":
				System.out
						.println("Input index of the product you want to delete");
				int inputIndex = input.nextInt();
				standardBasket.delProduct(inputIndex);
				break;

			case "total":
				System.out.println("Basket's content");
				standardBasket.listProducts();
				System.out.println("Total cost");
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