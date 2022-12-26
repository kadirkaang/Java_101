import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 2000;
        int right = 3;
        int price, select;
        String username, password;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            username = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();

            if (username.equals("kkg") && password.equals("123")) {
                System.out.println("Merhaba Kodluyoruz Bankasına Hoşgeldiniz!");
                while (true) {
                    System.out.println("1.Para Yatırma\n" +
                            "2.Para Çekme\n" +
                            "3.Bakiye Sorgulama\n" +
                            "4.Çıkış Yap");
                    select = input.nextInt();
                    switch (select) {
                        case (1):
                            System.out.print("Yatırmak istedipğiniz miktarı giriniz : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case (2):
                            System.out.print("Çekmek istediğiniz miktarı giriniz : ");
                            price = input.nextInt();
                            balance -= price;
                            System.out.println("Yeni Bakiye : " + balance);
                            break;
                        case (3):
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case (4):
                            System.out.println("Güle Güle");
                            return;
                        default:
                            System.out.println("Hatalı Tuşlama Yaptınız");
                    }
                }
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Çok Fazla Hatalı Giriş Yaptınız Hesabınız Bloke Olmuştur!");
                } else {
                    System.out.println("Hatalı Giriş, Kalan Giriş Hakkınız : " + right);
                }
            }
        }
    }
}
