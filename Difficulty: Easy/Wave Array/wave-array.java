class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int n = arr.length;

        // Swap adjacent pairs starting from index 0
        for (int i = 0; i < n - 1; i += 2) {
            // Swap arr[i] and arr[i+1]
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
