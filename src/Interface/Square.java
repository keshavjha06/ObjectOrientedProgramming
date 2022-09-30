package Interface;

public class Square implements Shape{
    String color;
    double side;

    public Square(String color,double side){
        this.color = color;
        this.side = side;

    }
    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public String info() {
        return "I am a " + color() + "Square and my area is " + area();
    }

    @Override
    public void defaultMethod() {

    }
}
