static class Counter {
	public int value;

	// Może zmienić stan obiektu utworzonego poza nią, bo jest jej przekazywany (w formie referencji)
	public void increaseOther(Counter other) {
		++other.value;
	}
}

public static void main(String[] args) {
	Counter c1 = new Counter();
	Counter c2 = new Counter();
	c2.increaseOther(c1);
	System.out.printf("c1: %d%nc2: %d%n", c1.value, c2.value);
}