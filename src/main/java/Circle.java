public class Circle implements Shape {
    private double radius;
    private static final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}