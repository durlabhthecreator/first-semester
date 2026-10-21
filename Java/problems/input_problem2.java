package problems;
import java.util.Scanner;

public class input_problem2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);    
      double a;
      System.out.println("Enter a number");
      a = sc.nextDouble();
      int b = (int) a%10;
      System.out.println("Last digit of this number is "+b);
    
    }
}