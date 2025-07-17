import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oper = sc.nextInt(); // 1 to set, 0 to clear
        int n = 5;               // binary: 0101
        int pos = 1;             // position to update

        int bitMask = 1 << pos;

        if (oper == 1) {
            // Set bit at position
            int newNumber = bitMask | n;
            System.out.println("After setting bit: " + newNumber);
        } else {
            // Clear bit at position
            int newBitMask = ~bitMask;
            int newNumber = newBitMask & n;
            System.out.println("After clearing bit: " + newNumber);
        }

        sc.close();
    }
}
