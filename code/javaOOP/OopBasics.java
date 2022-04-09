package javaOOP;

public class OopBasics{
    public static void main(String[] args) {
        System.out.println("Hello"); // Prints "Hello" on the output screen
        Human human = new Human(); //Onject of Human class created
        human.print(); //Method of Human class is called using the object of that class
    }
}
/*A java program can have any number of classes but only 1 public class*/
class Human{
    void print(){
        System.out.println("Hi, human");
    }
}