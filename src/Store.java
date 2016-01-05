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
					.println("Wpisz 'add' aby dodaæ produkt, 'del' aby odj¹æ, 'total' aby uzyskaæ podsumowanie");
			String inputCommand = input.next();

			Basket Basket = new Basket();
			
	//	Basket standardBasket = new Basket();

			if (inputCommand.equals("add")) {

				Basket.addProduct(new Product(Basket.getSize(), "mleko", 3));
				
				System.out.println(Basket.getSize());
		
				Basket.delProduct(0);
				System.out.println(Basket.getSize());
			
				for (Product Product : Basket){
					System.out.println(Product.getIndex());
				}
				
			}
			input.close();
		}
	}
}
