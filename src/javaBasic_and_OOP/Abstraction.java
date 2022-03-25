package javaBasic_and_OOP;


interface example{
    public void print();
}
abstract class base {
    public base() {
        System.out.println("Base Constructor called");
    }
    public void hello() {
        System.out.println(" Hello ");
    }
    abstract public void greet();

}

// Method overriding for Abstract Classes (Partial Abstraction)
class derived extends base {
    static{
        System.out.println("Static Block of derived Class");
    }
    {
        System.out.println("Instance Initialization Block");
    }
    @Override
    public void greet() {
        System.out.println("Namaste Java");
    }
}

//Method Overriding for Interfaces (100% Abstraction)
class intdederived implements example{
   
    public void print(){
        System.out.println("Interface Example");
    }
    static{
        System.out.println("Static Block of intderived Class");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        derived obj = new derived();
        System.out.println(" ");
        intdederived object = new intdederived();
        System.out.println(" ");
        obj.greet();
        System.out.println(" ");
        object.print();
    }

}
