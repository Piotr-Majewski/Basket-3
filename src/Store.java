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
				standardList.listProducts();
				standardList.totalCost();
			}

			if (inputCommand.equals("end")) {
				standardList.listProducts();
				standardList.totalCost();
				input.close();
				break;
			}
		}
	}
}
