import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int total = 0, inp;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Bir sayı giriniz : ");
            inp = input.nextInt();
            if (inp % 4 == 0) {
                total += inp;
            }
        } while (inp % 2 == 0);
        System.out.println("Total : " + total);
    }
}
