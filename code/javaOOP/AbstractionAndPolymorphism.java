package javaOOP;

//Interface is similar to a class which does nor require mentioning of the body of the methods.
//It is used to acheive data abatraction
interface Example{
    public void print();
}

//For Abstraction(Data Hiding) we can also use abstract classes where both normal and abstract methods can be declared.
//An abstract class can have abstract methods (Method without body) and concrete methods (Methods with the body) also. 
//The abstract class must have at least one abstract method.
 //A normal class can't have any abstract method.
abstract class Base {
    public Base() {
        System.out.println("Base Constructor called");
    }
    public void check(){
        System.out.println("Normal Method");
    }
    public void hello() {
        System.out.println(" Hello ");
    }
    //Abstract Method
    abstract public void greet();
}

// Inheritance of Abstract Class "Base" using "extends" keyword (Allows Partial Abstraction) 

class Derived extends Base {
    //Static Block executes even before the constructor of the parent class is called but executes only if the constructor is to be called in future(If there is Inheritance, obviously)
    static{
        System.out.println("Static Block of derived Class");
    }
    //This block is executed just before the constructor is called but executes only if the constructor is to be called in future.
    {
        System.out.println("Instance Initialization Block");
    }
    //Method Overriding(Contents of the method will be changed during implementation) 
    //[Runtime Polymorphism]
    @Override
    public void greet() {
        System.out.println("Hi Java");
    }
}


//Inheritance for Interfaces using implements keyword(100% Abstraction)
class Intf_dederived implements Example{
   //Method of the interface Example overriden
    public void print(){
        System.out.println("Interface Example");
    }
    //Method Overloading of the print method{Same method name but different method signature(parameters/datatypes)}
    //[Compile Time Polymorphism]
    public void print(int a){
        System.out.println("Interface Example");
    }
    //Static block which executes at the begining
    static{
        System.out.println("Static Block of intderived Class");
    }
}

public class AbstractionAndPolymorphism{
    public static void main(String[] args) {
        Derived obj = new Derived();
        System.out.println(" ");
        Intf_dederived object = new Intf_dederived();
        System.out.println(" ");
        obj.greet();
        System.out.println(" ");
        object.print();
    }
}
