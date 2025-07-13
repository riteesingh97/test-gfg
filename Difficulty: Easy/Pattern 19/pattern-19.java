class Solution {

    void printTriangle(int n) {
        // code here
       for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}