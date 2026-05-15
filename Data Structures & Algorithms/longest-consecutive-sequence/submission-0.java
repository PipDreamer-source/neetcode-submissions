class Solution {
    public int longestConsecutive(int[] nums) {

        // i m just doing by brute force approach 

        HashSet<Integer> hashSet=new HashSet<>();

        for(int num:nums){
            hashSet.add(num);

        }

        int maxlen=0;



        for(int num:hashSet){


  // check start of sequence jaha se code ka ek starting paoint milega there can be many we will find pairs with this starting point 


            if(!hashSet.contains(num-1)){


                int curr=num;
                int count=1;

                // pair bana rhe hai as start pata hai

                while(hashSet.contains(curr+1)){
                    curr++;
                    count++;
                }

                maxlen=Math.max(maxlen,count);




            }


        }
return maxlen;


        
    }
}
