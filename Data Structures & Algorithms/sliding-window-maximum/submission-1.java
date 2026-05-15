class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // It is standard fixed sized slidng window template can used
        // Deque is used work is remove from last and get first as max
        //  
      
       List<Integer> result=new ArrayList<>();
       Deque<Integer> d=new LinkedList<>();

        int i=0;
        int j=0;
        int n=nums.length;


    

        while(j < n){    

               // calculation and always removing element form last so that max is at front
             while(!d.isEmpty() && nums[d.peekLast()] < nums[j]){
               d.pollLast();
              }
                d.add(j);


           if(j-i+1 < k){
            j++;
              }
           else if(j-i+1 == k){

            result.add(nums[d.peekFirst()]);

            if(!d.isEmpty() && d.peekFirst() == i){
                d.pollFirst();
            }
            i++;
            j++;


        }

    


      }

      // converting part from list to int[] 
           int[] res=new int[result.size()];

         for(int p=0; p < result.size();p++){
             res[p]= result.get(p);
         }

         return res;

     
        
    }
}
