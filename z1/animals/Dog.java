package animals;

public class Dog {
	public String name;
	public int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void makeSound() {
		System.out.println("Woof, woof!");
	}
};
