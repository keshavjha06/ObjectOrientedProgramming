package encapsulation;

public class MyClass {
    public static void main(String[] args) {
        MyPrivateClass myPrivateClass = new MyPrivateClass();
        myPrivateClass.setStr("update my string"); //this is how we make private variable read only
        myPrivateClass.printString();
        //System.out.println(myPrivateClass.getStr());//this is how we make private variable write only
    }


}
