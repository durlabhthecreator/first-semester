package problems;
import java.util.Scanner;

// public class if_else_problem {
//     public static void main(String[] args) {
      //   Scanner sc = new Scanner(System.in);
      //   int a;
      //   System.out.println("Enter first price: ");
      //   a = sc.nextInt();
      //   Scanner sc1 = new Scanner(System.in);
      //   int b;
      //   System.out.println("Enter second price: ");
      //   b = sc1.nextInt();
      // if (a>b) {
      //   System.out.println(b+" is cheaper" );
//       }
//       else if (a==b){
//         System.out.println("Both prices are equal.");
//       }
//       else {
//         System.out.println(a+" is cheaper.");
//       }
//     }
// }

public class if_else_problem {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter first side of a triangle");
          a = sc.nextInt();
        int b;
        System.out.println("Enter second side of a triangle");
          b = sc.nextInt();
        int c;
        System.out.println("Enter third side of a triangle");
          c = sc.nextInt();
        if (a+b>c & a+c>b && b+c>a) {
          System.out.println("This triangle is valid" );
        } 
        else {
          System.out.println("This triangle is invalid" );
        }     
  }
}