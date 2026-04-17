class Tender {
    double cost;
    String company;

    Tender(String c, double co) {
        company = c;
        cost = co;
    }
}

public class Main {
    public static void main(String[] args) {

        Tender[] t = new Tender[5];
        t[0] = new Tender("ABC Ltd", 5000);
        t[1] = new Tender("XYZ Ltd", 3000);
        t[2] = new Tender("PQR Ltd", 7000);
        t[3] = new Tender("LMN Ltd", 2000);
        t[4] = new Tender("DEF Ltd", 4000);

        double min = t[0].cost;
        String company = t[0].company;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < min) {
                min = t[i].cost;
                company = t[i].company;
            }
        }
        System.out.println("Company with minimum cost: " + company);
    }
}
