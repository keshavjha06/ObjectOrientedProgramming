package inheritance;

public class MyClass {
    public static void main(String[] args) {
        MySubClass mySubClass = new MySubClass("constructor string from my class");
        mySubClass.superClassMethod();
        System.out.println(mySubClass.superStr);
        mySubClass.subClassMethod();
        mySubClass.printCommontString();
        mySubClass.printCommonMethod();
    }


}
