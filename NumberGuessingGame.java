import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rndom = new Random();
        int number = rndom.nextInt(100);
        int[] guessNumber = new int[5];
        int right = 0;
        boolean isWrong = false;

        while (right < 5) {
            System.out.println("======================================");
            System.out.print("0 - 100 Arasında Tahmininizi Yazınız : ");
            guessNumber[right] = input.nextInt();

            if (guessNumber[right] < 0 || guessNumber[right] > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptnız. Kalan hak : " + (5 - right));
                } else {
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan gidecektir.");
                    isWrong = true;
                }
                continue;
            }
            if (guessNumber[right] == number) {
                System.out.println("Tebrikler, doğru tahmin ettiniz : " + number);
                break;
            } else {

                System.out.println("Yanlış Tahmin !!");
                if (guessNumber[right] > number)
                    System.out.println(guessNumber[right] + " sayısı, gizli sayıdan büyüktür.");
                else
                    System.out.println(guessNumber[right] + " sayısı, gizli sayıdan küçüktür.");
                right++;
                System.out.println("Kalan hakkın : " + (5 - right));
            }
        }
        if (right == 5) {
            System.out.println("---------------------");
            System.out.println("Oyunu Kaybettiniz !");
            if (!isWrong)
                System.out.println("Tahminleriniz : " + Arrays.toString(guessNumber));
        }
    }
}
