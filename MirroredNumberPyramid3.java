public class Main {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern
        
        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            
            // Loop 1: Print leading spaces for alignment
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  "); // Two spaces for proper alignment
            }
            
            // Loop 2: Print increasing numbers (1 to i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Loop 3: Print decreasing numbers (i-1 down to 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}