static class Rectangle {
	public double width, height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	Rectangle() { this(0, 0); }
	Rectangle(double side) { this(side, side); }
	Rectangle(Rectangle other) { this(other.width, other.height); }

	public double area() { return this.width * this.height; }
	public double perimeter() { return 2 * this.width + 2 * this.height; }

	public void scale(double factor) {
		this.width *= factor;
		this.height *= factor;
	}

	public void displayInfo() {
		System.out.printf("Rect: width = %.2f\theight = %.2f%n", this.width, this.height);
	}
}

public static void main() {
	Rectangle rect = new Rectangle(2);
	Rectangle refRect = rect;
	Rectangle copyRect = new Rectangle(rect);
	rect.scale(2);

	rect.displayInfo();
	refRect.displayInfo();
	copyRect.displayInfo();

	// Wyjasnienie: refRect jest referencja do rect, wiec wskazuje na te same wartosci co rect
	// copyRect natomiast jest kopia, dlatego mutacje rect nie niosa wplywu na stan wewnetrzny copyRecft
}
