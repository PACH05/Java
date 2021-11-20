package javaPractice2;

class pen {
    String color;
    String name;

    public void print() {
        System.out.println(this.color);
        System.out.println(this.name);
    }
}

class gel extends pen {

}

class dot extends pen {

}

public class oops2 {
    public static void main(String[] args) {
        // pen pen1 = new pen();
        dot pen2 = new dot();
        pen2.color = "Blue";
        pen2.name = "Octane";
        pen2.print();
    }

}
