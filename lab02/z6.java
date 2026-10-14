static class Person {
	public String name;

	Person(String name) { this.name = name; }

	public void introduceYourself() {
		System.out.printf("Hi, my name is %s!%n", this.name);
	}
}

public static void main(String[] args) {
	Person first = new Person("Anna"); // 1. Powstał 1 obiekt - ten
	Person second = first; // 2. Powstały 2 referencje - first & second

	second.name = "Maria"; // 3. Bo second jest referencją do tego samego obiektu, który leży pod first - java nie wykonuje domyślnie kopii obiektu

	first.introduceYourself();
	second.introduceYourself();
}