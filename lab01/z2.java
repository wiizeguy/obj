import java.util.Scanner;

void main() {
    Scanner s = new Scanner(System.in);
    System.out.print("Podaj n: ");
    final int n = s.nextInt();
    
    System.out.printf("Liczba %sjest parzysta\n", n % 2 == 0 ? "" : "nie ");
    System.out.printf("Liczba %sjest podzielna przez 3\n", n % 3 == 0 ? "" : "nie ");

    int sum = 0;
    int even = 0;
    for (int i = 1; i <= n; ++i) {
        sum += i;
        if (i % 2 == 0)
            ++even;
    }
    System.out.printf("Suma: %d\n", sum);
    System.out.printf("Liczb parzystych: %d\n", even);
}
