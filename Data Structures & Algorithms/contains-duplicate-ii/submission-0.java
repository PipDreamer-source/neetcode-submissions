class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {


        HashSet<Integer> has=new HashSet<>();


        for(int i=0;i< nums.length;i++){


            if(has.contains(nums[i])){
                return true;
            }
            has.add(nums[i]);

                 if(has.size() > k){
            has.remove(nums[i-k]);
        }


        }
        return false;


   





}}