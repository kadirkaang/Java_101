public class Student {
    Course tarih;
    Course fizik;
    Course biyo;
    String name;
    String stuNO;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNO, String classes, Course tarih, Course fizik, Course biyo) {
        this.name = name;
        this.stuNO = stuNO;
        this.classes = classes;
        this.tarih = tarih;
        this.fizik = fizik;
        this.biyo = biyo;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(int tarih, int fizik, int biyo) {
        if (0 <= tarih && tarih <= 100)
            this.tarih.note = tarih;
        if (0 <= fizik && fizik <= 100)
            this.fizik.note = fizik;
        if (0 <= biyo && biyo <= 100)
            this.biyo.note = biyo;
    }

    public void addBulkPerformNote(int performTarih, int performFizik, int performBiyo) {
        if (0 <= performTarih && performTarih <= 100)
            this.tarih.performNote = performTarih;
        if (0 <= performFizik && performFizik <= 100)
            this.fizik.performNote = performFizik;
        if (0 <= performBiyo && performBiyo <= 100)
            this.biyo.performNote = performBiyo;
    }

    public void calcAverage() {
        this.average = ((this.tarih.note * 0.80 + this.tarih.performNote * 0.20) +
                (this.fizik.note * 0.70 + this.fizik.performNote * 0.30)
                + (this.biyo.note * 0.65 + this.biyo.performNote * 0.35)) / 3.0;
    }
    public void isPass() {
        if (this.tarih.note == 0 || this.fizik.note == 0 || this.biyo.note == 0
        || this.tarih.performNote == 0 || this.fizik.performNote == 0 || this.biyo.performNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public boolean isCheckPass() {
        calcAverage();
        return (this.average >= 55);
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Tarih Notu : " + this.tarih.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Biyoloji Notu : " + this.biyo.note);
    }


}
