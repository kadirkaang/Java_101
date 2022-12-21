import java.util.Scanner;

public class GradePointAverageCalculator {
    public static void main(String[] args) {
        int math, physical, history, music, biology, chemistry;

        Scanner input = new Scanner(System.in);

        System.out.print("Your math grade: ");
        math = input.nextInt();
        System.out.print("Your physical grade: ");
        physical = input.nextInt();
        System.out.print("Your history grade: ");
        history = input.nextInt();
        System.out.print("Your music grade: ");
        music = input.nextInt();
        System.out.print("Your biology grade: ");
        biology = input.nextInt();
        System.out.print("Your chemistry grade: ");
        chemistry = input.nextInt();

        int sum = (math + physical + history + music + biology + chemistry);
        double average = sum / 6.0;

        System.out.println("Your Grade Point Average : " + average);
        String message = (average >= 60) ? "You Passed" : "You Failed";
        System.out.println("Your Situation : " + message);
    }
}