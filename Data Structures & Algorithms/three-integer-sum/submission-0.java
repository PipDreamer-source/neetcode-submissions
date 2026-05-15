class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res=new ArrayList<>();


        Arrays.sort(nums);
        // Skip 2 elements in last as we fix position of i between those so that if required last can be used 

        for(int i= 0; i< nums.length -2;i++){

            int left=i+1;
            int right= nums.length -1;


            if(i> 0 && nums[i] == nums[i-1]){
                continue;
            }
            // skip same elements as want unique triplets


            while(left < right){


                   int sum= nums[i] + nums[left] + nums[right];


                   if(sum == 0){

                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));

                      left++;
                      right--;

                      // skip left and right same vlaues dont want same value again in triplet if duplicate exists

                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }


                   }
                   else if(sum < 0){

                   left++;

                   }
                   else{


                    right--;
                   }




            }
           



        }
         return res;
        
    }
}
