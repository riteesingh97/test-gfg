class Solution {

    // function to print a triangle pattern
    void printTriangle(int n) {
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " "); // print the value of c followed by a space
                c++; // increment the value of c after printing
            }
            System.out.println(); // print a new line after printing each row of numbers
        }
    }
}