import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        double range = 10, sum, perKM = 2.20, startPrice = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek Mesafeyi Giriniz (km) : ");
        range = input.nextDouble();

        sum = startPrice + (perKM * range);
        sum = (sum < 20) ? 20 : sum;
        System.out.println("Tutar : " + sum);
    }
}
