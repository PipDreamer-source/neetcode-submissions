class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Always remember that we need need to first check if hashsetdoes not value then get maxValue 
      //  if hashset contains duplicate then we will remove char at i;
           
           if(s == null || s.isEmpty()){
            return 0;
           }

        int i=0;
        int j=0;
        int n=s.length();

        HashSet<Character> hash=new HashSet<>();
       int maxLength = 0;



        while(j<n){


            if(!hash.contains(s.charAt(j))){
                hash.add(s.charAt(j));

                maxLength=Math.max(maxLength,j-i+1);
                j++;
            }
             else if(hash.contains(s.charAt(j))){


                while(hash.contains(s.charAt(j))){
                    hash.remove(s.charAt(i));
                    i++;
                }
            }



        }
        return maxLength;


        
    }
}
