package javaBasic2;

public class Oop{
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
class Human{
    void print(){
        System.out.println("Hi, human");
    }
}

class Action extends Human{
    void talk(){
        System.out.println("Talking");
    }
    void eat(){
        System.out.println("Eating");

    }

}