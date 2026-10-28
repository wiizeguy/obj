class Product {
	private static final int MAX_PRODUCTS = 3;
	private static int numberOfProducts = 0;

	public static int getNumberOfProducts() { return numberOfProducts; }

	public String name;
	public double price;

	Product(String name, double price) {
		if (numberOfProducts == MAX_PRODUCTS)
			throw new IllegalStateException("Próba utworzenie większej liczby produktów niż dopuszczalna!");
		++numberOfProducts;

		this.name = name;
		this.price = price;
	}
}

void main() {
	Product p0 = new Product("Name0", 1.23);
	Product p1 = new Product("Name1", 4.56);
	Product p2 = new Product("Name2", 7.89);

	assert Product.getNumberOfProducts() == 3;

	new Product("Name3", 1.09);
}

// 1. static, bo dotyczy "globalnego" stanu, nie stanu indywidualnych obiektów
// 2. final, bo jest stałą
// 3. nie final, bo zmienia się w trakcie działania programu
