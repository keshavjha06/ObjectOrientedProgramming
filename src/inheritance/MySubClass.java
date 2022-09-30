package inheritance;

public class MySubClass extends MySuperClass {

    String commonStr = "sub common String";

    public MySubClass(String constructorStr) {
        super(constructorStr);
        System.out.println("This is subclass constructor");
    }

    public void subClassMethod() {
        System.out.println("Sub Class Method");
    }

    public void printCommontString() {
        System.out.println(commonStr);
        System.out.println(super.commonStr);
    }

    public void commonMethod() {
        System.out.println("sub common method");
    }

    public void printCommonMethod() {
        commonMethod();
        super.commonMethod();
    }


}
