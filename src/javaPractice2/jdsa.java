package javaPractice2;

// import java.util.Stack;

public class jdsa {

    public static boolean jgame(int gamear[], int n) {
        int j, i = 0;
        while (i < gamear.length) {
            i = 0;
            j = gamear[i];
            i = i + j;
            if (i == (gamear.length - 1)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int array1[] = { 2, 3, 1, 1, 4 };
        boolean i;
        i = jgame(array1, 5);
        System.out.println(i);
    }

}
