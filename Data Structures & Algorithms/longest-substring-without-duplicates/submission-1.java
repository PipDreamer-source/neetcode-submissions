class Solution {
    public int lengthOfLongestSubstring(String s) {

        // window will exapnd at j++ and shrink if match not found slight variation from slandar variable sldng window as max substring size was not given



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
