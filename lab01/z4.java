import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // brak srednika - compile error

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { // assignment operator zamiast porownania - runtime error
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); // brak srednika - compile error
        }

        for (int i = 0; i <= 5; i++) { // dekrementacja zamiast inkrementacji - runtime error
            System.out.println(i);
        }

        scanner.close();
    }
}
