class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    double radius;
    Point p;  

    Circle(int x, int y, double r) {
        p = new Point(x, y);
        radius = r;
    }

    void display() {
        double area = 3.14 * radius * radius;

        System.out.println("Center Point: (" + p.x + ", " + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2, 3, 5); 
        c.display();
    }
}
