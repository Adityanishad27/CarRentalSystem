package CarRentalSystem;

public class Main {
	public static void main(String[] args) {
		
		CRentalSystem rentalsystem= new CRentalSystem();
		
		

        Car car1 = new Car("C001", "Toyota", "Camry", 600.0); 
        Car car2 = new Car("C002", "Honda", "Accord", 700.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 1500.0);
           
        rentalsystem.addCar(car1);
        rentalsystem.addCar(car2);
        rentalsystem.addCar(car3);
        
        
         rentalsystem.menu();
		
	}

}
