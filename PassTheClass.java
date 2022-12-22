import  java.util.Scanner;

public class PassTheClass {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, count = 0, sum = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        int[] arr = {mat, fizik, turkce, kimya, muzik};
        for (int i = 0; i < 5; i++) {
            if (arr[i] <= 100 && 0 <= arr[i]) {
                count++;
                sum += arr[i];
            }
        }
        average = sum / count;
        if (average <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler, sınıf geçtiniz!");
        }
        System.out.println("Ortalamanız : " + average);
    }
}
