class StaticCalculator {
	private static int numberOfOperations;
	public static int getNumberOfOperations() { return numberOfOperations; }

	static int add(int a, int b) {
		++numberOfOperations;
		return a + b;
	}

	static int add(int a, int b, int c) {
		++numberOfOperations;
		return a + b + c;
	}

	static double add(double a, double b) {
		++numberOfOperations;
		return a + b;
	}

	static int subtract(int a, int b) {
		++numberOfOperations;
		return a - b;
	}

	static int multiply(int a, int b) {
		++numberOfOperations;
		return a * b;
	}
};

void main() {
	assert StaticCalculator.add(1, 1) == 2;
	assert StaticCalculator.subtract(9, 5) == 4;
	assert StaticCalculator.multiply(6, 7) == 42;

	assert StaticCalculator.getNumberOfOperations() == 3;

	assert StaticCalculator.add(1, 2, 3) == 6;
	assert StaticCalculator.add(2.5, 2.7) == 5.2;
}