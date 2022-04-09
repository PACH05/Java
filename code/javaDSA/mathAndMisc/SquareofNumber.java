package javaDSA.mathAndMisc;

import java.util.function.Function;
//This program shows the use of lambda functions in Java using generics 
public class SquareofNumber {
    public static void main(String[] args) {
        Function<Integer, Integer> abc = (x) -> {return x*x;};
        System.out.println("The square of 10 is : "+ abc.apply(10));
    }
}

// interface Example{
//     public void example1();
// }

// int a = 10;
// Example ex = ()-> { 
//     System.out.println("Example of Lambda Method : "+ a);
// };
// ex.example1();