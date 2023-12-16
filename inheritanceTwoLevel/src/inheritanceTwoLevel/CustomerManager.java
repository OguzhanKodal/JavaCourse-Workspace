package inheritanceTwoLevel;

public class CustomerManager {
	
	public void add(Logger logger) {
		//Müşteri ekleme kodları yazılmış (simulasyon)
		
		System.out.println("Müsteri eklendi.");

		logger.log();
	}
}

	
	
	
	
/*
	public void add() {
		//Müşteri ekleme kodları yazılmış (simulasyon)
		
		System.out.println("Müsteri eklendi.");
		
		DatabaseLogger logger = new DatabaseLogger(); //add(Logger logger) yazıldığı için gerek kalmadı.
		logger.log();
	}
}
*/