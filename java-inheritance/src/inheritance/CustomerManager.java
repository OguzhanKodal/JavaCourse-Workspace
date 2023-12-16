package inheritance;
 
public class CustomerManager {
	/*
		// 2 tane add method olması @Overloading
	    public void add(IndividualCustomer customer) {
	        System.out.println(customer.customerNumber + " kaydedildi.");
	    }

	    // CorporateCustomer tipindeki müşteriler için özel add metodu
	    public void add(CorporateCustomer customer) {
	        System.out.println(customer.customerNumber + " kaydedildi.");
	    }
	*/
	
	//Polymorphism
	public void add(Customer customer) {
	
		System.out.println(customer.customerNumber + " kaydedildi.");
	}	
	//Müşteri(customer), onu extends eden sınıfların refaranslarını tutabilir.
	// public class CorporateCustomer extends Customer  
	//CorporateCustomer.java dosyasında böyle yazmıştık.

	public void addMultiple(Customer[] customers) {  //array(dizi)
		
		for(Customer customer : customers) {  //döngü
			add(customer); //yukarıdaki add çalıştıracak.
		}
	}

}
	
		
