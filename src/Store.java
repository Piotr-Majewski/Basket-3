import java.util.List;
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

			if (inputCommand.equals("add")) {
				addProduct(productList);
			}
			if (inputCommand.equals("del")) {
				removeProduct(productList);
			}
			if (inputCommand.equals("total")) {
				double total = 0;
				int counter = 0;

				System.out.println();

				for (Product Product : productList) {
					total = total + Product.getPrice();
					counter = counter + 1;
					System.out.println(Product.getIndex() + " "
							+ Product.getName() + " " + Product.getPrice());
				}
				if (counter == productList.size() && total < 200) {
					System.out.println();
					System.out.println("Kwota ca�kowita wynosi" + " " + total);
				} else if (counter == productList.size() && total > 200) {
					System.out.println();
					double totalDiscount = ((total - 200) * 0.1 + 200);
					System.out.println("Kwota ca�kowita wynosi" + " " + total);
					totalDiscount = totalDiscount *= 100;
					totalDiscount = Math.round(totalDiscount);
					totalDiscount = totalDiscount /= 100;

					System.out.println("Kwota do zap�aty wynosi" + " "
							+ totalDiscount);
					input.close();
					System.exit(0);

				}
			}
		}
	}
}