static class Person {
	public String name;

	Person(String name) { this.name = name; }

	Person(Person other) {
		this.name = other.name;
	}

	public void introduceYourself() {
		System.out.printf("Hi, my name is %s!%n", this.name);
	}
}

public static void main(String[] args) {
	Person first = new Person("Anna");
	Person second = new Person(first);

	second.name = "Maria";

	first.introduceYourself();
	second.introduceYourself();

	// Tworząc second w ten sposób, nie przypisujemy do niego referencji do first.
	// Zamiast tego wołany jest copy constructor dostający referencję do first, z której przekopiowuje pola do nowopowstałego obiektu pod second.
}