class Dog {
    String name, breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println("Wow wow");
    }

    public void showInformation() {
        System.out.printf("Name: %s\nBreed: %s\nAge: %d\n", this.name, this.breed, this.age);
    }
};

public static void main(String[] args) {
    final Dog bingo = new Dog("Bingo", "German Shephered", 5);
    bingo.showInformation();
    bingo.bark();

    final Dog luna = new Dog("Luna", "Mixed", 9);
    luna.showInformation();
    luna.bark();

    final Dog bella = new Dog("Bella", "Dalmatian", 2);
    luna.showInformation();
    luna.bark();
}

