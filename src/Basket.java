import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basket {

	private List<Product> productList;
	
	public Basket () {

		productList = new ArrayList<>();
		
		// Produkty dodane do koszyka

	/*	productList.add(new Product(productList.size(), "mas³o", 3.5));
		productList.add(new Product(productList.size(), "chleb", 100.7));
		productList.add(new Product(productList.size(), "ogórek", 2));
		productList.add(new Product(productList.size(), "kawior", 100));
		productList.add(new Product(productList.size(), "szynka", 6.24));
		productList.add(new Product(productList.size(), "paprykarz", 1.99));
		productList.add(new Product(productList.size(), "olej", 5.7));
		productList.add(new Product(productList.size(), "makaron", 4.6));	
	*/
		
		addProduct(productList);
		
	//	System.out.println(total(productList));
	}
				

	
	static double total(List<Product> productList){ 
		 double total = 0;
		 int counter = 0; 
		 for (Product Product: productList) {
			total = total + Product.getPrice(); counter = counter + 1;}
		 return total;
		 }
	

	static Object addProduct(List<Product> productList) {
		Scanner input = new Scanner(System.in);
		System.out.println("podaj nazwê");
		String newName = input.next();
		System.out.println("podaj cenê");
		double newPrice = input.nextDouble();
		productList.add(new Product(productList.size(), newName, newPrice));
		input.close();
		return productList;
		}
	
	static Object removeProduct(List<Product> productList){
		Scanner input = new Scanner(System.in);
		double total = 0;
		int counter = 0;
		for (Product Product : productList) {
			total = total + Product.getPrice();
			counter = counter + 1;
			System.out.println(Product.getIndex() + " "
					+ Product.getName() + " " + Product.getPrice());}
		System.out.println();
		System.out
				.println("Podaj numer indeksu produktu, który chcesz usun¹æ");
		int removeIndex = input.nextInt();
		productList.remove(removeIndex);
		input.close();		
		return productList;
	}
}
