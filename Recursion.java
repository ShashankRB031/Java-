public class Recursion {
    public static void printNum(int n) {
        if (n == 0) {
            return; // Base case to stop recursion
        }
        System.out.println(n);
        printNum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNum(n); // Output: 5 4 3 2 1
    }
}
