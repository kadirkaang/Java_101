import java.util.Scanner;

public class PrimeNumberRecursive {
    static boolean isPrime(int n, int i) {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        System.out.println(isPrime(number, 2));
    }
}
