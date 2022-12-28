import java.util.Scanner;

public class ExponentialCalcRecursive {

    static int exponential(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return (base * exponential(base, (exp - 1)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exp = input.nextInt();
        System.out.println("Sonuç : " + exponential(base, exp));

    }
}
