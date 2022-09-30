package Interface;

interface Shape {
    int i = 5;//It is by default public,static & final .final variable needs to be initialized
    String color();//methods are by default public and abstract,so need to use those keywords
    double area();
    String info();

    void defaultMethod();

    static void staticMethod(){
        System.out.println("static method");
    }

}
