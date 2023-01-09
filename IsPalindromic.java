import java.util.Scanner;

public class IsPalindromic {

    public static boolean isPalindromic(String str) {
        int i = 0, j = (str.length() - 1);

        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;

        System.out.print("Bir kelime giriniz : ");
        str = input.nextLine();
        System.out.println(isPalindromic(str));

    }
}
