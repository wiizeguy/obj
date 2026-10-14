static class Car {
	String brand, model;
	int productionYear;
	double mileage;

	Car() {
		this.brand = "Opel";
		this.model = "Corsa";
		this.productionYear = 2002;
		this.mileage = 300000;
	}

	Car(String brand, String model) {
		this.brand = brand;
		this.model = model;

		this.productionYear = 2026;
		this.mileage = 0.0;
	}

	Car(String brand, String model, int productionYear, double mileage) {
		this(brand, model);
		this.productionYear = productionYear;
		this.mileage = mileage;
	}

	Car(Car other) {
		this.brand = other.brand;
		this.model = other.model;
		this.productionYear = other.productionYear;
		this.mileage = other.mileage;
	}

	public void drive(double distance) {
		if (distance > 0.0)
			this.mileage += distance;
	}

	public void showInformation() {
		System.out.printf("Brand: %s%nModel: %s%nProduction year: %d%nMileage: %.3f%n",
	                      this.brand, this.model, this.productionYear, this.mileage);
	}
}

public static void main(String[] args) {
	Car corsa = new Car();
	corsa.showInformation();

	Car corsa2 = new Car(corsa);
	corsa.drive(1337);
	// wynik - wartość mileage w corsa2 nie zmieniła się
	// wyjaśnienie - wartości pól z *other* zostały skopiowane przez konstruktor kopiujący do nowopowstałego obiektu
	// corsa2 jest oddzielnym obiektem, nie referencją do corsa, bo nie został wykonany prosty assignment, tylko call do konstruktora
	corsa2.showInformation();

	Car mustang = new Car("Ford", "Mustang");
	mustang.showInformation();
	mustang.drive(100);
	mustang.drive(-10000);
	mustang.showInformation();
}
