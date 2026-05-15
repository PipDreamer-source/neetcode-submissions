class Solution {
    public boolean isHappy(int n) {

        /*Logic is that if happy number is there means number itself will reduce and comes as 1 such that 19--- 82---66--72---51--
         similar like this and in end becomes 1 if cycle is there that it becomes big hashset will detect the cycle and prevent from happenInteger
         */

        HashSet<Integer> seen=new HashSet<>();

      

           while(n != 1){
              if(seen.contains(n)){
            return false;
             }

            seen.add(n); 

            int sum = 0; 

           

             while(n > 0){
                 

                 int digit= n%10;
                sum= sum + (digit*digit);
                 n=n/10;


        }


          n=sum;
   

           }


         return true;


    






        
    }
}
