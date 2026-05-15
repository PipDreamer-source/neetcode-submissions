class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] ans=new int[2*nums.length];
        int n=nums.length;

        // 1st way

        // for(int i=0;i<2*nums.length;i++){

        //     ans[i]=nums[i%n];
        // }

      //  2nd way 

      for(int i=0;i<nums.length;i++){
        ans[i]=nums[i];
        ans[i+n]=nums[i];

      }
        return ans;
        
    }
}