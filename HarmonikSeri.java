import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        double result = 0, n, i = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısını Giriniz : ");
        n = input.nextInt();
        while (i <= n) {
            result += (1 / i);
            i++;
        }
        System.out.println(result);
    }
}
