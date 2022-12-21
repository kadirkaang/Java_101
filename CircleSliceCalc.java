import java.util.Scanner;

public class CircleSliceCalc {
    public static void main(String[] args) {
        double r, pi = 3.14, alpha, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextDouble();
        System.out.print("Hesaplanacak dilimi giriniz (derece): ");
        alpha = input.nextDouble();

        area = (pi * (r * r) * alpha) / 360;

        System.out.println("Daire dilimin alanı : " + area);

    }
}
