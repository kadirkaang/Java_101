import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0, sum;
        double armutKG, elmaKG, domatesKG, muzKG, patlicanKG;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        armutKG = input.nextDouble();
        System.out.print("Elma kaç kilo ? : ");
        elmaKG = input.nextDouble();
        System.out.print("Domates kaç kilo ? : ");
        domatesKG = input.nextDouble();
        System.out.print("Muz kaç kilo ? : ");
        muzKG = input.nextDouble();
        System.out.print("Patlıcan kaç kilo ? : ");
        patlicanKG = input.nextDouble();

        sum = (armutKG * armut) + (elmaKG * elma) + (domatesKG * domates) + (muz * muzKG) + (patlicanKG * patlican);
        System.out.println("Toplam Tutar : " + sum + " TL");
    }
}
