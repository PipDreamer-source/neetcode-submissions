class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

       char[] arr1 = s.toCharArray();
       char[] arr2 = t.toCharArray();

       HashMap<Character,Integer> hash1=new HashMap<>();

       for(char c:arr1){
           hash1.put(c, hash1.getOrDefault(c, 0) + 1);   

       }

        for(char c:arr2){
          hash1.put(c, hash1.getOrDefault(c, 0) - 1);   

          if(hash1.get(c) < 0){
            return false;
          }
       }
       return true;

       

   


    }
}
