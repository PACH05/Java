package javaOOP;

public class OOPPractice1 {

    static public void main(String[] args) {
        Student st = new Student();
        Prasanta pach = new Prasanta();
        System.out.println(st.go());
        System.out.println(pach.go());
    }
}

class Student{
    int run(){
        System.out.println("hi");
        return 0;
    }
    int go(){
        System.out.println("go");
        return 0;
    }
}

class Prasanta extends Student{
   
    public int run(){
        return 2+2;
    }

    public int go(){
        return 2+5;
    }
}
