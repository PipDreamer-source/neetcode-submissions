class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }


// 1st approach 

    /*
       int[] freq=new int[26];


       for(int i=0;i<s.length();i++){

           freq[s.charAt(i) - 'a']++;
           freq[t.charAt(i) - 'a']--;

       }

       for(int num:freq){

        if(num != 0){
            return false;
        }
       }
       return true;
  */

  //2 nd approach 



              HashMap<Character,Integer> hash=new HashMap<>();

              for(char ch : s.toCharArray()){

                hash.put(ch,hash.getOrDefault(ch,0 )+1);
              }

              for(char ch:t.toCharArray()){

              hash.put(ch,hash.getOrDefault(ch,0 ) -1 );
              }

      

           for(int num:hash.values()){

                       if(num !=0){
                        return false;
                       }
           }
           return true;








    }
}
