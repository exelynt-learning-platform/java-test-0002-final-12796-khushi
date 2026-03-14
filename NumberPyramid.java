public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5; // Total number of rows

        for (int i = 1; i <= n; i++) {
            // 1. Print leading spaces for alignment
            for (int j = n; j > i; j--) {
                System.out.print("  "); // Use two spaces to match number width
            }

            // 2. Print ascending part (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // 3. Print descending part (i-1 down to 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}