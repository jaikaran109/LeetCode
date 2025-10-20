class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        int[] arr = new int[n];

        // Copy last k elements to the beginning of arr
        for (int i = 0; i < k; i++) {
            arr[i] = nums[n - k + i];
        }

        // Copy first n-k elements to the rest of arr
        for (int i = k; i < n; i++) {
            arr[i] = nums[i - k];
        }

        // Copy arr back to nums
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}
