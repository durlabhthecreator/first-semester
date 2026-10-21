package problems;
public class problem2 {
    public static void main(String[] args) {
      double salary = 50000;
      double DA= 0.2*salary;
      double HRA= 0.1*salary;
      double gross = salary+DA+HRA;
      System.out.printf("The gross salary is %.2f",gross);
      
    }
}