import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		Store myStore = new Store();
		myStore.init();

	}

	public void init() {
		Scanner input = new Scanner(System.in);
		{
			System.out
					.println("Wpisz 'add' aby doda� produkt, 'del' aby odj��, 'total' aby uzyska� podsumowanie");
			String inputCommand = input.next();

			Basket standardBasket = new Basket();

			if (inputCommand.equals("add")) {

				standardBasket.addProduct(new Product(standardBasket.getSize(), "mleko", 3));
				standardBasket.addProduct(new Product(standardBasket.getSize(), "mas�o", 2));

				System.out.println(standardBasket.getSize());

			}
			input.close();
		}
	}
}
