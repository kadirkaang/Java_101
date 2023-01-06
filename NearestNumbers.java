import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NearestNumbers {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int nearestBig = arr[0], nearestSmall = arr[0];
        Scanner input = new Scanner(System.in);

        for (int i : arr) {
            if (i < nearestSmall)
                nearestSmall = i;
        }
        for (int i : arr) {
            if (i > nearestBig)
                nearestBig = i;
        }
        System.out.print("Please, Enter a number : ");
        int number = input.nextInt();
        for (int n : arr) {
            if (n < number && n > nearestSmall) {
                nearestSmall = n;
            }
        }
        for (int n : arr) {
            if (n > number && n < nearestBig) {
                nearestBig = n;
            }
        }
        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Girilen sayı : " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + nearestSmall);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + nearestBig);

    }
}
