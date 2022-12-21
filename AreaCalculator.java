import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        double a, b, c, area, u;

        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin 1. Kenarınız Giriniz : ");
        a = input.nextDouble();
        System.out.print("Üçgenin 2. Kenarınız Giriniz : ");
        b = input.nextDouble();
        System.out.print("Üçgenin 3. Kenarınız Giriniz : ");
        c = input.nextDouble();

        u = (a + b + c) / 2;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin alanı : " + area);
    }
}
