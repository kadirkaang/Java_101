import java.util.Scanner;

public class MiniSort {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayısı giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci sayısı giriniz : ");
        b = input.nextInt();
        System.out.print("Üçüncü sayısı giriniz : ");
        c = input.nextInt();

        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.print(a + " > " + b + " > " + c);
            } else {
                System.out.print(a + " > " + c + " > " + b);
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.print(b + " > " + a + " > " + c) ;
            } else {
                System.out.print(b + " > " + c + " > " + a);
            }
        } else {
            if (a <= b) {
                System.out.print(c + " > " + a + " > " + b);
            } else {
                System.out.print(c + " > " + b + " > " + a);
            }
        }
    }
}
