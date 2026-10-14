class Point {
	double x, y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double distance(Point otherPoint) {
		return Math.hypot(this.x - otherPoint.x, this.y - otherPoint.y);
	}
}

public static void main(String[] args) {
	final Point p1 = new Point(9, 11);
	final Point p2 = new Point(5, 8);
	System.out.printf("Distance: %.2f\n", p1.distance(p2));
}
