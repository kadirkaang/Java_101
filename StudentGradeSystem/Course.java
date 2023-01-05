public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int performNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.performNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix))
            this.teacher = teacher;
        else
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!!!");
    }
}
