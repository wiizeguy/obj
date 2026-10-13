import java.util.Scanner;

void main() {
    System.out.println("Podaj kolejno 10 liczb calkowitych...");

    Scanner s = new Scanner(System.in);
    int[] nums = new int[10];
    for (int i = 0; i < 10; ++i)
        nums[i] = s.nextInt();

    int min = nums[0];
    int max = nums[0];
    int sum = 0;

    for (int i = 0; i < 10; ++i) {
        final int n = nums[i];
        if (n < min)
            min = n;
        if (n > max)
            max = n;
        sum += n;
    }

    System.out.printf("Min: %d\nMax: %d\nSuma: %d\n", min, max, sum);
    
    final int avg = sum / 10;
    System.out.printf("Srednia: %d\n", avg);

    int nAboveAvg = 0;
    for (int i = 0; i < 10; ++i) {
        if (nums[i] > avg)
            ++nAboveAvg;
    }
    System.out.printf("Powyzej sredniej: %d\n", nAboveAvg);
}
