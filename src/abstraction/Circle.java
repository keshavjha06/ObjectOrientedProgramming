package abstraction;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    String info() {
        return "I am a " + super.color + "Circle and my area is " + area();
    }
}
