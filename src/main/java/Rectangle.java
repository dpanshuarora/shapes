public class Rectangle implements Shape {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createSquare(double side) {
        return new Rectangle(side, side);
    }

    public double calculateArea() {
        return (length * breadth);
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}