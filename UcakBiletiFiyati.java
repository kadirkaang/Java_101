import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {
        int age, range;
        byte choice;
        double perKM = 0.10, sum;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : "); range = input.nextInt();
        System.out.print("Yaşınızı giriniz : "); age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş) : ") ; choice = input.nextByte();

        if (range <= 0 || age <= 0 || !(1 <= choice && choice <= 2)) {
            System.out.println("Hatalı giriş yaptınız!");
            return;
        }
        sum = perKM * range;
        if (age < 12)
            sum *= 0.50;
        else if (age <= 24)
            sum *= 0.90;
        else if (age >= 65)
            sum *= 0.70;
        if (choice == 2)
            sum = (sum * 0.80) * 2;
        System.out.println("Toplam Tutar : " + sum);
    }
}
