class Solution {
    public int countSeniors(String[] details) {

        // remeber always formula (data.charAt(11) - '0') * 10
        //            + (data.charAt(12) - '0');
       

        int count=0;

        for(String data:details){


           int age = (data.charAt(11) - '0') * 10
                    + (data.charAt(12) - '0');
       
            
              if(age > 60){
                count++;
            }
         
          
        }
        return count;
       
  
        
    }}
