package abstraction;

abstract class Shape {
    String color;

    public Shape(String color){
        this.color = color;//assigning arg to class level variable using this keyword
    }

    //abstract methods
    abstract double area();
    abstract String info();

    public String getColor(){
        return color;
    }
}
