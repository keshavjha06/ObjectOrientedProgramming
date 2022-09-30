package accessmodifiers.qa;

 public class QaClass {
    protected String str = "My String";

    protected void myMethod(){
        System.out.println("qa class my method");
    }

    private void myMethod1(){
        myMethod();
        System.out.println(str);
    }
}
