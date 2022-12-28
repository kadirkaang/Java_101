import java.util.Scanner;

public class DesenOlusturma {
    static int pattern(int N, int sN, int dModel) {
        if (N > sN)
            return 0;
        else {
            System.out.print(N + " ");
            if (N <= 0) {
                dModel *= -1;
            }
            return pattern((N + dModel), sN, dModel);
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int N = input.nextInt();
        pattern(N, N, -5);
    }
}
