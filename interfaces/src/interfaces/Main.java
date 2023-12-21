package interfaces;

public class Main {

	public static void main(String[] args) {
		
		//2.adım bkz /customermanager.java
		//CustomerManager customerManager = new CustomerManager(new SmsLogger());
		
		//3.adım array oluşturunca. bkz /customermanager.java
		
		Logger[] loggers = { new SmsLogger(),new EmailLogger() };
				
		CustomerManager customerManager = new CustomerManager(loggers);

		Customer oguz = new Customer(1, " oguz " , "kodal");
		
		customerManager.add(oguz);
	}

}
