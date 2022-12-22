import  java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int year;
        String[] str = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare",
                "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : "); year = input.nextInt();
        System.out.println("Çin Zodyağı Burcunuz : " + str[year % 12]);
    }
}
