import java.util.Scanner;

public class PowersOfFourAndFive {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        System.out.println("4'ün Kuvvetleri :");
        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }
        System.out.println("5'ün Kuvvetleri :");
        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }
    }
}
