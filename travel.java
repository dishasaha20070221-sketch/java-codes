abstract class Product {
    int id;
    Product(int id) { this.id = id; }
    abstract void display();
}
class Book extends Product {
    Book(int id) { super(id); }
    void display() {
        if (id == 1)
            System.out.println("Book: Paris");
        else
            System.out.println("Book: Tokyo");
    }
}

class CD extends Product {
    CD(int id) { super(id); }
    void display() {
        if (id == 1)
            System.out.println("CD: Paris Audio");
        else
            System.out.println("CD: Tokyo Audio");
    }
}


public class travel {
    public static void main(String[] args) {
        Product b = new Book(1);
        Product c = new CD(1);

        b.display();
        c.display();
    }
}
