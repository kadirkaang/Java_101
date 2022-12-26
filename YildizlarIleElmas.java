import java.util.Scanner;

public class YildizlarIleElmas {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1) ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = (n - 2); i > -1; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
