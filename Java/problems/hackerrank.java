package problems;

import java.util.Scanner;

// import java.util.Scanner;

// public class hackerrank_problems {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int a;
//       System.out.println("Enter first number");
      
//       a = sc.nextInt();
//       Scanner sc1 = new Scanner(System.in);
//       int b;
//       System.out.println("Enter second number");
      
//       b = sc.nextInt();
//       if (a%2==0 && b%2==0) {
//         System.out.println("We are simple.");
//       }
//       else{
//         System.out.println("We are odd.");
//       } 
//     }
// }

// public class hackerrank_problems {
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       int a;
//       System.out.println("Enter an integer: ");
//       a = sc.nextInt();
//       if (a%2!=0) {
//         System.out.println("Weird");
//         if(a%2==0){
//           System.out.println("Weird");
//           if(6<a && a<20) {
//             System.out.println("Weird");
//         }
//       }
//     }

//       else if (a%2==0) {
//         System.out.println("Not Weird");
//         if (2<a && a<5) {
//           System.out.println("Not Weird");
//             if (a>20) {
//                 System.out.println("Not Weird");
//           }
//         }
//       }
//   }
// }

// public class hackerrank_problems {
//     public static void main(String[] args) {
      // Scanner sc= new Scanner(System.in);
      // int a;
      // System.out.println("Enter your marks");
      // a = sc.nextInt();
//       if (100>=a && a>90) {
//         System.out.println("GREAT!!");
//       }
//       else if (90>=a && a>80) {
//         System.out.println("GOOD!");
//       }
//       else if (80>=a && a>70) {
//         System.out.println("Fair");
//       }
//       else if (70>=a && a>60) {
//         System.out.println("Meets expectations");
//       }
//       else if (60>=a && a>50) {
//         System.out.println("NOT GOOD!");
//       }
//       else if (50>=a && a>40) {
//         System.out.println("Average");
//       }
//       else if (a<40){
//         System.out.println("FAIL!!");
//       }
//     }
// }

// public class hackerrank_problems {
//     public static void main(String[] args) {
//       ;
//             Scanner sc= new Scanner(System.in);
//       char c;
//       System.out.println("Enter a character");
//       c = sc.next().charAt(0);
//       if (Character.isUpperCase(c)) {
//         System.out.println("1");
//       }
//       if (Character.isLowerCase(c)) {
//         System.out.println("0");
//       }
//       else {
//         System.out.println("-1");
//       }
//     }
// }

// OR

// public class ch {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//       char ch;
//       System.out.println("Enter a alphabetic character");
//       ch = sc.next().charAt(0);
//       if (ch>='A' && ch<='Z') {
//         System.out.println("Your character is uppercase");
//       }  
//       if (ch>='a' && ch<='z') {
//         System.out.println("Your character is lowercase");
//       }
//       else{
//         System.out.println("-1");
//       }
//     }
// }


public class hackerrank {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a;
      System.out.println("Enter first number");
      a= sc.nextInt();
      int b;
      b= sc.nextInt();
      System.out.println("Enter second number");
      if (a>b) {
        System.out.println(a+" is bigger");
      }
      else if (a<b){
        System.out.println(b+" is bigger");
      }
      else{
        System.out.println("Both are equal.");
      }
      }
    }