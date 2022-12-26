import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n, r, result, fR = 1, fN = 1, x = 1;

        Scanner input = new Scanner(System.in);

        // C(n,r) = n! / (r! * (n-r)!)
        System.out.print("C(n,r) n değerini giriniz : ");
        n = input.nextInt();
        System.out.print("r değerini giriniz : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            fN *= i;
        }
        for (int i = 1; i <= r; i++) {
            fR *= i;
        }
        for (int i = 1; i <= (n- r); i++) {
            x *= i;
        }
        result = fN / (fR * x);
        System.out.println("C(n,r) : " + result);
    }
}