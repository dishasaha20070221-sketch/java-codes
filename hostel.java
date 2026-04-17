interface Department {
    void showDept();
}

class Hostel {
    void showHostel() {
        System.out.println("Hostel Details");
    }
}

class Student extends Hostel implements Department {
    String name = "Disha";

    public void showDept() {
        System.out.println("Dept: CSE");
    }

    void showStudent() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.showStudent();
        s.showDept();
        s.showHostel();
    }
}
