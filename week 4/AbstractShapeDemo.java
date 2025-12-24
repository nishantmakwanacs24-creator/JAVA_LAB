abstract class Shape {
    int a, b;

    // Abstract method
    abstract void printArea();
}

class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        a = length;
        b = breadth;
    }

    void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Triangle extends Shape {

    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle = " + area);
    }
}

class Circle extends Shape {

    Circle(int radius) {
        a = radius;
    }

    void printArea() {
        double area = 3.14 * a * a;
        System.out.println("Area of Circle = " + area);
    }
}

public class AbstractShapeDemo {
    public static void main(String[] args) {

        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(6, 4);
        Shape c = new Circle(7);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
