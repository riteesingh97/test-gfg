class Solution {
    public int maxPerimeter(int[] arr) {
        // code here
      Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(nums, Collections.reverseOrder());

        // Check triplets for triangle inequality
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] < nums[i + 1] + nums[i + 2]) {
                return nums[i] + nums[i + 1] + nums[i + 2];
            }
        }
        
        // No valid triangle found
        return -1;
    }
}