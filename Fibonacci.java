import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci eleman sayısını giriniz : ");
        int step = input.nextInt();

        for (int i = 0; i < step; i++) {
            System.out.print(printFibonacci(i) + " ");
        }

    }

    public static int printFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return (printFibonacci(n - 1) + printFibonacci(n - 2));
    }
}
