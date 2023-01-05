public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "555", "TRH");
        Teacher t2 = new Teacher("Fatma Ayşe", "543", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "542", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course biyo = new Course("Biyoloji", "103", "BIO");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyo.addTeacher(t3);

        Student s1 = new Student("Inek Saban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,70,50);
        s1.addBulkPerformNote(70,80,90);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "444", "4",tarih, fizik, biyo);
        s2.addBulkExamNote(70,50,30);
        s2.addBulkPerformNote(40,50,70);
        s2.isPass();

    }
}
