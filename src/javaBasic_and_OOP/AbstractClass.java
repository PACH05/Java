package javaBasic_and_OOP;

abstract class base {
    public base() {
        System.out.println("Base Constructor called");
    }

    public void hello() {
        System.out.println(" Hello ");
    }

    abstract public void greet();

}

// Method overriding
class derived extends base {
    @Override
    public void greet() {
        System.out.println("Namaste");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        derived obj = new derived();
        obj.greet();
    }

}
