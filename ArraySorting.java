import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = input.nextInt();
        System.out.println("Enter the elements of the array :");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Element : ");
            arr[i] = input.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted : " + Arrays.toString(arr));
    }
}
