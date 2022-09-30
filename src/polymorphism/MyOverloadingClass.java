package polymorphism;

public class MyOverloadingClass {
    public void myMethod(String str){
        System.out.println(str);
    }

    public void myMethod(String str,int i){
        System.out.println(str + i);
    }

    public void myMethod(int i){
        System.out.println(i);
    }
}
