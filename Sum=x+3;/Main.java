import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for x: ");
        int x = scanner.nextInt();

        System.out.print("Enter value for y: ");
        int y = scanner.nextInt();

        int sum = x + y;

        System.out.println("Sum of x and y: " + sum);
    }
}