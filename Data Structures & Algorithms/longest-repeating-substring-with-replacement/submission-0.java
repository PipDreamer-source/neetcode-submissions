class Solution {
    public int characterReplacement(String s, int k) {


// idea is no of charcters needed for perect change we need to find main maxFre os that lowest frequency one will be replaced with k and be distinct

        int[] freq=new int[26];
        int i=0;
        int j = 0;
        int max=0;
        int maxLen=0;


        while(j < s.length()){

            // frequency of each element 


            char ch=s.charAt(j);
            freq[ch - 'A']++;
            max= Math.max(max,  freq[ch - 'A']);


            //invalid window shrink the window
            if((j-i +1) - max > k){

                char chari=s.charAt(i);

                freq[chari - 'A']--;
                i++;


            }

           // where j-i+1 is window size and we need to maxWidow where this replacemnt can happen

            maxLen=(Math.max(maxLen,j-i+1));
            j++;


        }

        return maxLen;



        
        
    }
}
