interface Gross {
    void calcGross();
}

class Employee {
    String name = "Disha";
}

class Salary extends Employee implements Gross {
    double basic = 10000;

    public void calcGross() {
        double gross = basic + 2000;
        System.out.println("Gross Salary: " + gross);
    }
}

public class Main {
    public static void main(String[] args) {
        Salary s = new Salary();
        s.calcGross();
    }
}
