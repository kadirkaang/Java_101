import java.util.Arrays;

public class NumbersFrequency {

    public static boolean checkList(int[] set, int number, int index) {
        for (int i = 0; i < index; i++) {
            if (set[i] == number)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] set = new int[list.length];
        int frequency = 0;
        int startIndex = 0;

        System.out.println("Dizi : " + Arrays.toString(list));
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (checkList(set, list[i], startIndex))
                    set[startIndex++] = list[i];
            }
        }
        for (int i = 0; i < startIndex; i++) {
            for (int k : list) {
                if (set[i] == k)
                    frequency++;
            }
            System.out.println(set[i] + " sayısı " + frequency + " kere tekrar edildi.");
            frequency = 0;
        }
    }
}
