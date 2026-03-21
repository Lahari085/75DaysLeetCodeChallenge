class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;

        // move non-zero elements forward
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }

        // fill remaining with zeros
        while(i < nums.length){
            nums[i] = 0;
            i++;
        }
    }
}