abstract class hello{
    void run(){
        System.out.println("Running");
    }
    abstract void walk();
    public hello(){
        System.out.println(" i m constructor in abstract class");
    }
    static void staticMethod(){
        System.out.println("I m static method!");
    }
}
//Abstract class can have both abstract and non-abstract methods
//Abstract class cannot be instantiated
//Abstract class can have constructor and static methods

public class abstract01 extends hello{
    public void walk(){
        System.out.println("Walking!");
    }
    public static void main(String[] args) {
        abstract01 a = new abstract01();
        hello.staticMethod();
    }
}
