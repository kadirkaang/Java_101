import java.util.Scanner;

public class BasamakToplama {
    public static void main(String[] args) {
        int number, result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        System.out.println("Girilen Sayının basamaklarının toplamı : " + result);
    }
}
