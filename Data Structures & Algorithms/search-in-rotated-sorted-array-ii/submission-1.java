class Solution {
    public boolean search(int[] nums, int target) {

        
      int left = 0;
      int right= nums.length -1;

  
      while(left <= right){
             
             int mid=left + (right-left)/2;

             if( nums[mid] == target){
            
              return true;
             }

             // if we dont know where to go then shrink space by both sides

              if( nums[left] == nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
                continue;
             }

             // search in left side sorted part 


             if( nums[left] <= nums[mid]){
                             

                 if ( nums[left] <= target && target < nums[mid])  {
               
                         right=mid-1;
                 }   
                 else{
                         left=mid+1;
                 }     


                                    



             }

             //search in right side sorted part 
             else{

                  if(nums[mid] < target && target <= nums[right]){
                        left=mid+1;
                  }
                  else{
                     right=mid-1;

                  }

             }



      }
      return false;
        
        
    }
}