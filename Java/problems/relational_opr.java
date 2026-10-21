 package problems;
// import java.util.Scanner;
// public class relational_opr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a;
//         System.out.println("Enter a number: ");
//         a = sc.nextInt();
//         System.out.println("Is " +a+ " positive? " + (a > 0));
//     }
// }

import java.util.Scanner;

public class relational_opr {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a;
      System.out.println("Enter your marks: ");
      a = sc.nextInt();
      System.out.println("Are you pass? " + (a>=33));
    }
}