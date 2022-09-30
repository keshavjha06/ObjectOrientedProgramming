package accessmodifiers.dev;

import accessmodifiers.qa.QaClass;

public class MyClass extends QaClass {

    public static void main(String[] args){
        MyClass myClass = new MyClass();
        myClass.myClassMethod();
    }

    public void myClassMethod(){
        myMethod();
    }
}
