package oopIntro;
//3.video
public class Product {
	
	//Encapsulation (kapsülleme)
	//field' lar
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	// private double unitPriceAfterDiscount; bunu okuma yaptığımız için gerek kalmadı (get)
	
	//Constructor Bloku (Yapıcı Blok)
	public Product() {
	}
	public Product(int id, String name, double unitPrice, String detail,
			double discount, double unitPriceAfterDiscount ) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		// this.unitPriceAfterDiscount = unitPriceAfterDiscount;bunu okuma yaptığımız için gerek kalmadı (get)
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice * this.discount / 100);
	}
	
	
}


/*
 * public class Product {
	
	//Encapsulation (kapsülleme)
	//field' lar
	final int id;
	final String name;
	final double unitPrice;
	final String detail;
	final double discount;
	final double unitPriceAfterDiscount;
	
	Final ifadesi kısıtlama yapar. Field'lar sadece Constructor' lar tarafından erişilebilir.
 */