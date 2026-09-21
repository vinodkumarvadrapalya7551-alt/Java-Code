class Rectangle {
    double length;
    double width;

    double CalculateArea() {
        return length * width;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length = 10;
        r.width = 5;

        System.out.println("Length: " + r.length);
        System.out.println("Width: " + r.width);
        System.out.println("Area of Rectangle: " + r.CalculateArea());
    }
}
