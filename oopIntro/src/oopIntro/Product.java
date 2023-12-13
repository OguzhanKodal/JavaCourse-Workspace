package oopIntro;

public class Product {
	//field' lar
	int id;
	String name;
	double unitPrice;
	String detail;
	
	//Constructor Bloku (Yapıcı Blok)
	// Aslında bu blok yazmasanda var.
	// ama ekstra bişe tanımlamak için yazmak gerekiyor
	public Product() {
		System.out.println("selam");
	}
	//Aynı isimli 2 tane Constructor olabilir.
	// Parantez içine parametre denir
	public Product(int id, String name, double unitPrice, String detail) {
		this(); //Üsteki Constructor çalıştırmak istersen bunu yazabilirsin.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
		//this.id kısmındaki id public class Product'taki id'dir.
		// eşittir sonrasında id constructor'in id'sidir.
	}
	
	
}
