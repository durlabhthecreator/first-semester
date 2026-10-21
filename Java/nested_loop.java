import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;

        System.out.println("Enter row number");
        row = sc.nextInt();

        System.out.println("Enter column number");
        column = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}