package polymorphism;

public class FullTime extends Employee{

    @Override
    int salary(){
        return base + 20000;
    }

    void myMethod(){

    }

    static String designation(){ //we cannot override static methods
        return "Full Time";
    }
}
