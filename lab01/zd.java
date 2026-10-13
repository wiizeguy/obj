import java.util.Scanner;

public void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Podaj liczbę: ");
	int n = s.nextInt();
	s.close();

	while (n > 0) {
		System.out.printf("%d", n % 10);
		n /= 10;
	}
	System.out.println();
}
