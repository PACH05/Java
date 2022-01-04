package javaDSA;

// Program to demonstrate fibonacci Series using Dynamic Programming
public class FibDp {
    public static void main(String[] args) {

       System.out.println(fib(4));
    }
  static int fib(int n){
//Using Dynamic Programming Approach
   if(n<=2){
       return 1;
   }
   if(n<=0){
       return 0;
   }
   int fibo[] = new int[n];
   fibo[0]=0;
   fibo[1]=1;
    for (int i = 2; i < n; i++) {
        fibo[i]=fibo[i-1]+fibo[i-2];
    }
    return fibo[n-1];
  }
}
