import java.util.Scanner;

public class MinMaxCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumber = 0, minNumber = 0, n, i = 1, number;

        System.out.print("Kaç adet sayı gireceğinizi belirtin : ");
        n = input.nextInt();

        while (n > 0) {
            System.out.print(i + ". sayıyı giriniz : ");
            number = input.nextInt();
            if (i == 1) {
                maxNumber = number;
                minNumber = number;
            }
            else {
                minNumber = Math.min(minNumber, number);
                maxNumber = Math.max(maxNumber, number);
            }
            i++;
            n--;
        }
        System.out.println("En büyük sayı : " + maxNumber);
        System.out.println("En küçük sayı : " + minNumber);
    }
}
