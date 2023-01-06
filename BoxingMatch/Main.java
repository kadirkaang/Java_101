public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali", 100, 25, 75, 25);
        Fighter f2 = new Fighter("Ahmet", 100, 20, 70, 30);

        Ring r = new Ring(f1, f2, 60, 80);

        r.start();
    }
}