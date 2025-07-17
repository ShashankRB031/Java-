import java.util.Scanner;

public class MulandPrint {

    public static int CalculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        // Input second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Print product
        System.out.println("Product: " + CalculateProduct(a, b));

        sc.close(); // Best practice
    }
}
