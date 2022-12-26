import java.util.Scanner;

public class ExponentialCalc {
    public static void main(String[] args) {
        int n, k, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı : ");
        n = input.nextInt();
        System.out.print("Üs Olacak Sayı : ");
        k = input.nextInt();

        for (int i = 0; i < k; i++) {
            result *= n;
        }
        System.out.println("Sonuç : " + result);
    }
}