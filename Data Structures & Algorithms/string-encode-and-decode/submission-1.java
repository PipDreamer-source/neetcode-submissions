class Solution {

    // logic is first we add a size of string and then add append # and then add the exact string 

    /// use 2 pointer to evaluate and all i for inital and j is also i but jmoves and ultimately moves and add i to get new string word 

    public String encode(List<String> strs) {


        StringBuilder sb=new StringBuilder();

        for(String s:strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
         

    }

    public List<String> decode(String str) {

        // Deocode means same string ka chaarcter nikalna then 

         List<String> decoded=new ArrayList<>();
          int i=0;
        while(i < str.length()){

            int j=i;

           while(str.charAt(j) != '#'){
            j++;
           }

            int length= Integer.parseInt(str.substring(i,j));
         j++;
            String decode=str.substring(j,j+length);
            decoded.add(decode);
   
            i=j+length;

           


        }
        return decoded;

    }
}
