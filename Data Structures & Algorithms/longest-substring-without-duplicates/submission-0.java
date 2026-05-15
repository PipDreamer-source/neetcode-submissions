class Solution {
    public int lengthOfLongestSubstring(String s) {



    int n=s.length();

    int i=0;
    int j=0;
    int max=0;
    HashSet<Character> hash=new HashSet<>();

    while(j<n){


            if(!hash.contains(s.charAt(j))){
                hash.add(s.charAt(j));
                max=Math.max(max,j-i+1);
                   j++;
            }
            else if(hash.contains(s.charAt(j))){

                while(hash.contains(s.charAt(j))){


                    hash.remove(s.charAt(i));
                    i++;
                }

            }

    }
    return max;
        
    }
}
