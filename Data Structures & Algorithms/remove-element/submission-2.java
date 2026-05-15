class Solution {
    public int removeElement(int[] nums, int val) {

        // In this basically logic is that jiski values mil rhi hai usko update kr do jo match nhi kr rhi rest ko dont do anything at all 

        int slow =0;
            for(int fast=0;fast<nums.length;fast++){

                if(nums[fast] != val){

                    nums[slow] =nums[fast];
                    slow++;

                }

            }     

            return slow;   





    }


}