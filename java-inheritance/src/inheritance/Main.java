package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndividualCustomer oguz = new IndividualCustomer();
		oguz.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "67890";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "35791";
		
		/*
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(oguz);
		customerManager.add(hepsiBurada);
		customerManager.add(abc);
		*/
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {oguz, abc, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
	
	}

}
