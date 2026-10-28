class InitializationDemo {
	static public int staticField = staticVal();
	public int instField = instVal();

	static { System.out.println("Static block"); }
	{ System.out.println("Instance block"); }

	private static int staticVal() { System.out.println("Static method"); return 1; }
	private int instVal() { System.out.println("Instance method"); return 7; }

	InitializationDemo() { System.out.println("Ctor"); }
};

void main() {
	InitializationDemo id0 = new InitializationDemo();
	InitializationDemo id1 = new InitializationDemo();

	/*
	Static method
	Static block
	Instance method
	Instance block
	Ctor
	Instance method
	Instance block
	Ctor
	*/
}