import java.util.Scanner;

public class GradePointAverageCalculator {
    public static void main(String[] args) {
        int math, physical, history, music, biology, chemistry;

        Scanner input = new Scanner(System.in);

        System.out.println("Your math grade: ");
        math = input.nextInt();
        System.out.println("Your physical grade: ");
        physical = input.nextInt();
        System.out.println("Your history grade: ");
        history = input.nextInt();
        System.out.println("Your music grade: ");
        music = input.nextInt();
        System.out.println("Your biology grade: ");
        biology = input.nextInt();
        System.out.println("Your chemistry grade: ");
        chemistry = input.nextInt();

        int sum = (math + physical + history + music + biology + chemistry);
        double average = sum / 6.0;

        System.out.println("Your Grade Point Average : " + average);
        String message = (average >= 60) ? "You Passed" : "You Failed";
        System.out.println("Your Situation : " + message);
    }
}