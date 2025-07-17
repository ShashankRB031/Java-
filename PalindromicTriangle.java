public class PalindromicTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print first half numbers (descending)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Print second half numbers (ascending)
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
