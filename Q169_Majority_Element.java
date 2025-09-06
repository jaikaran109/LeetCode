class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);  // sort
        int n = nums.length; 
        return nums[n/2]; //  occurence of majority element is more than n/2 . 
                            //so the element present in the middle is the majority element
    }
}
