package polymorphism;

public class Employee {
    int base = 10000;

    int salary(){
        return base; //final method cannot be overridden
    }

    static String designation(){
        return "tester";
    }
}
