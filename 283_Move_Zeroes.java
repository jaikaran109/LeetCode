class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]  != 0){
                nums[nonzero] = nums[i];
                nonzero++;
            }
        }
        for(int i = nonzero ; i < nums.length ; i++){
            nums[i] = 0;
        }
    }
}
