class Solution {
    public boolean hasDuplicate(int[] nums) {



     HashSet<Integer> value=new HashSet<>();

     for(int n:nums){

        if(value.contains(n)){
            return true;
        }
        
            value.add(n);
            
        }
        return false;

     }
   
}