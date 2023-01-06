import java.util.Arrays;

public class RepeatingEvenNumbers {

    public static boolean checkArray(int[] arr, int i, int number) {
        for (int j = 0; j < i + 1; j++) {
            if (arr[j] == number)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 5, 12, 4, 2, 6, 3, 8, 12, 4, 2};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j] && i != j && (list[i] % 2 == 0)) {
                    if (checkArray(duplicate, startIndex, list[i]))
                        duplicate[startIndex++] = list[i];
                    break;
                }
            }
        }
        for (int n : duplicate) {
            if (n != 0)
                System.out.println(n);
        }
    }
}
