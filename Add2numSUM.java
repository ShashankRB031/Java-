import java.util.Scanner;

public class Add2numSUM {

    // Function to calculate sum
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Input two integers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Call function and print result
        int sum = calculateSum(a, b);
        System.out.println("Sum: " + sum);

        sc.close(); // Close scanner
    }
}
