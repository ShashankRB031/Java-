public class CountPathRec {

    public static int countPath(int i, int j, int n, int m) {
        // Base Case: If out of bounds
        if (i == n || j == m) {
            return 0;
        }

        // Reached destination cell
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Move down
        int downPaths = countPath(i + 1, j, n, m);

        // Move right
        int rightPaths = countPath(i, j + 1, n, m);

        // Total paths from current cell
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n = 3, m =3 ;
        int totalPath = countPath(0, 0, n, m);
        System.out.println(totalPath);
    }
}
