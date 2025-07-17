import java.util.Scanner;

public class FactorialOfNum {

    // Corrected function name
    public static void Factorial(int n) {
        if(n<0){
            System.out.println("Invalid num");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Call the function
        Factorial(n);

        sc.close();
    }
}
