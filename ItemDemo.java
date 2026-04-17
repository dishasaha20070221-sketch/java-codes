class Item {
    int code;
    double price;

    void setData(int c, double p) {
        code = c;
        price = p;
    }
    void display() {
        System.out.println(code + "\t\t" + price);
    }
}

public class ItemDemo {
    public static void main(String[] args) {

        Item items[] = new Item[5];
        double total = 0;

        items[0] = new Item();
        items[0].setData(101, 50.5);

        items[1] = new Item();
        items[1].setData(102, 75.0);

        items[2] = new Item();
        items[2].setData(103, 100.25);

        items[3] = new Item();
        items[3].setData(104, 60.75);

        items[4] = new Item();
        items[4].setData(105, 80.0);
        System.out.println("Code\t\tPrice");
        for (int i = 0; i < 5; i++) {
            items[i].display();
            total += items[i].price;
        }
        System.out.println("------------------------");
        System.out.println("Total Price = " + total);
    }
}
