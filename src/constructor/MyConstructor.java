package constructor;

public class MyConstructor {

    /*constructor executes a block of code when ever an object is created.
    when ever you create an object constructor is called
    It will not return values
    name of constructor should be the class name
    compiler will call implicit constructor if you have not defined constructor block
    */
    public MyConstructor() {
        System.out.println("I am constructor");
    }

    public MyConstructor(String str) {
        System.out.println("I am parameterized constructor1");
        System.out.println(str);
    }

    public MyConstructor(int a, int b) {
        System.out.println("I am parameterized constructor2");
        int c = a + b;
        System.out.println(c);
    }

    public static void getData() {
        System.out.println("I am in the static method");
    }

    public void getData1() {
        System.out.println("I am in the method");
    }


    public static void main(String args[]) {
        MyConstructor.getData();
        MyConstructor num = new MyConstructor();
        num.getData1();
        MyConstructor myConstructor = new MyConstructor();
        MyConstructor myConstructor1 = new MyConstructor("Hello");
        MyConstructor myConstructor2 = new MyConstructor(4, 5);

    }
}
