package app;

import animals.Cat;
import animals.Dog;

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog("Snoop Dogg", 7);
		Cat c = new Cat("V", 5);

		d.makeSound();
		c.makeSound();
	}
}