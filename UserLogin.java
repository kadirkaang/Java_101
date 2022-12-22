import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, select;
        String defUserName = "patika", defPassword = "java123";

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals(defUserName) && password.equals(defPassword)) {
            System.out.println("Giriş Yaptınız !");
        } else if (userName.equals(defUserName)) {
            System.out.println("Şifreyi Yanlış Girdiniz !");
            System.out.print("Şifreyi Değiştirmek İster Misiniz ? (E/h) : ");
            select = input.nextLine();

            if (select.equals("E")) {
                while (true) {
                    System.out.print("Yeni Şifreyi Giriniz : ");
                    password = input.nextLine();

                    if (password.equals(defPassword)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else {
                        System.out.println("Şifre oluşturuldu.");
                        break;
                    }
                }
            }
            else
                System.out.println("İyi günler :)");
        } else
            System.out.println("Kullanıcı adını yanlış girdiniz !");
    }
}
