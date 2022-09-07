package javaOOP;

//Dynamic Method Dispatch is also called Method Overriding
public class DynamicMethodDispatch {
  public static void main(String[] args) {
      A a = new A();
      B b = new B();
      C c = new C();
      A r;
      r=a;
      r.print();
      r=b;
      r.print();
      r=c;
      r.print();
  }   
}

class A {
    void print(){
        System.out.println("Class A");
    }
}
class B extends A{
    void print(){
        System.out.println("Class B");
    }
}
class C extends A {
    void print(){
        System.out.println("Class C");
    }
}
