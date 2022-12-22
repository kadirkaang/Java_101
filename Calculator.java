import javax.management.MBeanRegistration;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.print("Yapmak istediğiniz işlem nedir ? :");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                if (n2 == 0)
                    System.out.println("Bir sayı 0'a bölünemez");
                else
                    System.out.println("Bölme : " + (n1 / n2));
                break;
            case 4:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            default:
                System.out.println("Geçersiz İşlem");
        }
    }
}
