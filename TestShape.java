class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}


class Square extends Shape {
    int side;

    Square(int s) {
        side = s;
    }

    void area() {
        int result = side * side;
        System.out.println("Area of Square = " + result);
    }
}


class Rectangle extends Shape {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        int result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}


class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}


public class TestShape {
    public static void main(String args[]) {
        Square s = new Square(4);
        Rectangle r = new Rectangle(5, 3);
        Circle c = new Circle(2);

        s.area();
        r.area();
        c.area();
    }
}
