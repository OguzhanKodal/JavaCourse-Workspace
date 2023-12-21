package interfaces;

public class CustomerManager {
	//loosly - tightly coupled (gevşek-sıkı bağlılık)
	
	//private Logger logger;
	
	//public CustomerManager(Logger logger) {
	//	this.logger = logger;
	//}
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
		
	}

	public void add(Customer customer) {
		System.out.println("Müşteri Eklendi" + customer.getFirstName());
		
		//Utils utils = new Utils(); //static yaptığımız için kaldırdık.
		Utils.runLoggers(loggers, customer.getFirstName());
		
	// 3.adım bunu da ayrı bir class'a taşıdık.
	//	for (Logger logger: loggers) {
	//		logger.log(customer.getFirstName());
	//	}
		//2.adım
		//this.logger.log(customer.getFirstName());
		
		//1.adım
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + "veritabanına loglandı");
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName ());

		// 3.adım bunu da ayrı bir class'a taşıdık.
	//	for (Logger logger: loggers) {
	//		logger.log(customer.getFirstName());
	//	}
		
		
		//2.adım tek log için array yazmadan önce
		//this.logger.log(customer.getFirstName());
		
		//1.adım kirli kod
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.log(customer.getFirstName() + "veritabanına loglandı");
	}
}

/*
public void add(Customer customer) {
System.out.println("Müşteri Eklendi" + customer.getFirstName());

DatabaseLogger logger = new DatabaseLogger();
logger.log(customer.getFirstName() + "veritabanına loglandı");
}

public void delete(Customer customer) {
System.out.println("Müşteri silindi " + customer.getFirstName());
DatabaseLogger logger = new DatabaseLogger();
logger.log(customer.getFirstName() + "veritabanına loglandı");
}
}
*/