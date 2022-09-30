package polymorphism;

public class MyClass {
    public static void main(String[] args) {
        Employee employee = new FullTime();
        System.out.println("Full time employee salary is : " + employee.salary());

        employee = new Contractor();
        System.out.println("Contractor employee salary is : " + employee.salary());

        FullTime f = new FullTime();
        f.myMethod();

        System.out.println(Employee.designation());//This is called as Method hiding
        System.out.println(FullTime.designation());
        System.out.println(Contractor.designation());


        MyOverloadingClass myOverloadingClass = new MyOverloadingClass();
        myOverloadingClass.myMethod(5);
        myOverloadingClass.myMethod("Keshav");
        myOverloadingClass.myMethod("Keshav",6);



    }
}
