import java.util.Scanner;

public class CiftSayiProgrami {
    public static void main(String[] args) {
        int sum = 0, number, j = 0, average;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (i % 12 == 0) {
                sum += i;
                j++;
            }
        }
        average = sum / j;
        System.out.println("3 ve 4'e bölünebilen sayıların ortalaması : " + average);
    }
}
