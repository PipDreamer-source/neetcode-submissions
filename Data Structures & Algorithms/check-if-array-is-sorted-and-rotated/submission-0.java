class Solution {
    public boolean check(int[] nums) {
        int breakCount=0;

        // always remember that last element we need to check with first form circular so use modulo operator 

        for(int i=0;i<nums.length;i++){


            if(nums[i] > nums[(i+1) % nums.length]){
                breakCount++;
            }
        }

        return breakCount <= 1;


    }}