public class PassingVal {
    public static void main(String[] args) {
        int a =1;
 //        increment(a);
//        System.out.println(a);
        Check ck = new Check();
        ck.increase(a);
        System.out.println(a);
    }

    public static void increment(int a){
        ++a;
        System.out.println(a);
    }
}

class Check{
    public void increase(int a){
        ++a;
        System.out.println("Class pass : "+ a);
    }
}
