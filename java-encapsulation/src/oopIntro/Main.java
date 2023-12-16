package oopIntro;
//3.video
public class Main {

	public static void main(String[] args) {
		
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenovo v15");
		product1.setDetail("16GB Ram");
		product1.setDiscount(10);
		product1.setUnitPrice(16000);
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		

		//Product product2 = new Product(2, "Lenovo V16", 25000, "32GB Ram", 23, 24);
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Içecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
	}

}
