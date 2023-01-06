import com.sun.source.tree.WhileLoopTree;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void start() {
        if (checkWeight()) {
            if (firstFighter()) {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("=====YENİ ROUND=====");
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor!");
        }
    }

    public void printScore() {
        System.out.println("-------------");
        System.out.println(f1.name + " Kalan Can : " + f1.health);
        System.out.println(f2.name + " Kalan Can : " + f2.health);
    }

    public boolean checkWeight() {
        return (minWeight <= f1.weight && f1.weight <= maxWeight) && (minWeight <= f2.weight && f2.weight <= maxWeight);
    }

    public boolean firstFighter() {
        double randomValue = Math.random() * 100;
        return randomValue < 50;
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }
        return false;
    }
}
