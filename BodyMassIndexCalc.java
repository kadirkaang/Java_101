import java.util.Scanner;

public class BodyMassIndexCalc {
    public static void main(String[] args) {
        double weight, size, bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        size = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz : ");
        weight = input.nextDouble();

        bodyMassIndex = weight / (size * size);
        System.out.println("Vücut Kitle İndeksiniz : " + bodyMassIndex);
    }
}
