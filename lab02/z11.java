public static /*static nie jest czescia rozwiazania - lifehack*/ class Product {

    String name;
    double price;

    // był sprecyzowany typ zwracany przez konstruktor
    public Product(String name, double price) {
        // Rola `this.` - odniesienie się do pola wewnątrz obiektu, na którym wywołana jest metoda
        this.name = name;   // brak this.
        this.price = price; // brak this.
    }

    public void show() {
        System.out.println(this.name + ": " + this.price); // brak this
    }
}

// Wyrzucenie klasy nie jest czescia rozwiazania - lifehack
public static void main(String[] args) {
    Product product =
            new Product("Monitor", 1200);

    product.show();
}
