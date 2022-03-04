import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
      try {
          int arr[] = new int[5];
          Scanner sc = new Scanner(System.in);
          String s = "Sandip";
          s = s.concat("Paul");
          char ch[] = new char[s.length()];
          ch = s.toCharArray();
          System.out.println(ch[12]);
    } catch (Exception e) {
          System.out.println(e);
      }
      finally {
          int s = 6;
          System.out.println(s++);
          System.out.println(s);
      }
    }
}
