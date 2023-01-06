import java.util.Scanner;

public class HarmonicAverageCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int length = input.nextInt();
        double H, h = 0;

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + ". element of the array:");
            arr[i] = input.nextInt();
            h = 1.0 / arr[i];
        }
        H = arr.length / h;
        System.out.print("The Harmonic Average of the elements in the array : " + H);
    }
}
