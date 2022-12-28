import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int step;

        System.out.print("Basamak sayısını giriniz : ");
        step = input.nextByte();

        for (int i = step - 1; i >= 0; i--) {
            for (int j = 0; j < (step - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2 + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
