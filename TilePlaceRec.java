public class TilePlaceRec {

    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2; // Either vertical or all horizontal
        }
        if (n < m) {
            return 1; // Only horizontal possible
        }

        // Vertical placement
        int vertPlacements = placeTiles(n - m, m);

        // Horizontal placement
        int horPlacements = placeTiles(n - 1, m);

        return vertPlacements + horPlacements;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
}
