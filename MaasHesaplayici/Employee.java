public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int currentYear = 2021;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary <= 1000)
            return 0;
        return (this.salary * 0.03);
    }

    public double bonus() {
        if (this.workHours <= 40)
            return 0;
        return (this.workHours - 40) * 30.0;
    }

    public double raiseSalary() {
        if ((this.currentYear - this.hireYear) < 10) {
            return this.salary * 0.05;
        } else if ((this.currentYear - this.hireYear) < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public void printInfo() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte maaş : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary()));
    }

}
