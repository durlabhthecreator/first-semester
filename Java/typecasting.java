public class typecasting {
    public static void main(String[] args) {
    //   int a = (int)10.8;
    //   System.out.println("a is "+a);
    //   int x = 2;
    //   double y = 4;
    //   System.out.println(x+y);
    char c = 'D'+1;
    int i = c;
    System.out.println("c is "+i);
    }
}
// Types of Typecasting
// Implicit Typecasting (Automatic / Coercion):

// Done automatically by the compiler or interpreter.

// Usually happens when assigning a smaller data type to a larger one (e.g., storing an int in a float).

// No loss of data or precision.

// Example (Python/JavaScript): Adding an integer and a float results in a float.

// Explicit Typecasting (Manual / Casting):

// Forced manually by the programmer using specific syntax or built-in functions.

// Necessary when converting a larger data type to a smaller one (e.g., double to int), which risks data truncation or precision loss.

// Example (C/C++): int x = (int) 5.99; (Result is 5).

// Example (Python): x = int("10") (Converts string to integer).