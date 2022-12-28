public class PrimeNumber {
    public static void main(String[] args) {
        int i = 2;

        while (i < 100) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    public static boolean isPrime(int number) {
        int i = 2;

        while (i <= (number / i)) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
