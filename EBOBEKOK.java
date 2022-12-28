import java.util.Scanner;
import java.util.zip.ZipFile;

public class EBOBEKOK {
    public static void main(String[] args) {
        int ebob = 1, ekok = 1, i = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();

        if (n1 <= n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        } else {
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        }
        System.out.println("EBOB : " + ebob);
        i = 1;
        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("EKOK : " + ekok);
    }
}
