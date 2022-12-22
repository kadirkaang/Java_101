import java.util.Scanner;

public class HavaDurumuOneri {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (heat <= 15 && 5 <= heat) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        } else if (15 < heat && heat <= 25) {
            System.out.println("Piknik Yapabilirsin.");
        } else {
            System.out.println("Yüzmeye Gidebilirsin.");
        }
    }
}
