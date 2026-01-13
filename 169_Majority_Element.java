class Solution {
    public int majorityElement(int[] arr) {
        int val = arr[0];
        int count = 1;

        //Booyre More Voting Algorithm
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == val){
                count++;
            }else{
                if(count > 0){
                    count--;
                }
                else{
                    val = arr[i];
                    count++;
                }
            }
        }
        return val;

    }
}
