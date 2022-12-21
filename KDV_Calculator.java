import  java.util.Scanner;

public class KDV_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret Tutarını giriniz : ");
        double money = input.nextDouble();
        double kdvOran = 0.18;

        System.out.println("KDV'siz Tutar : " + money);
        System.out.println("KDV oranı : " + kdvOran);
        System.out.println("KDV tutarı : " + (money * kdvOran));
        System.out.println("KDV'li Fiyat : " + (money * 0.18 + money));
    }
}