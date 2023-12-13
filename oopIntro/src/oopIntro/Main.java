package oopIntro;

public class Main {

	public static void main(String[] args) {

/*
 * Gerçekte böyle çalışsa bile bu şekilde yazılmaz. OOP kullanılır

		String[] products = {
				"Lenovo v15",
				"Lenovo v20",
				"Casper 5 "
		};
		int[] unitInStock = {
				3,
				4,
				7
		};
 	
*/	
		
		//Nesne Oluşturma
		
		Product product1 = new Product();
		product1.id = 1;
		product1.name = "Lenovo V14";
		product1.unitPrice = 17000;
		product1.detail = "16 GB Ram ";
		
		//Constructor için mainde böyle yazılır
		//Product.java dosyasında Constructor'a bağlı.
		Product product2 = new Product(2, "Lenovo V16", 25000, "32GB Ram");
/*
		Product product2 = new Product();
		product2.id = 2;
		product2.name = "Lenovo V16";
		product2.unitPrice = 25000;
		product2.detail = "32 GB Ram ";
*/		
		Product product3 = new Product();
		product3.id = 3;
		product3.name = "MSI G43 ";
		product3.unitPrice = 12000;
		product3.detail = "8 GB Ram ";
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
	
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
		Category[] categorys = {category1,category2};
		
		for (Category category : categorys ) {
			System.out.println(category.name);
		}
		
		System.out.println(categorys.length);
		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

	}

}
