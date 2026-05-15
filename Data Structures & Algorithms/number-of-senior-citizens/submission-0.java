class Solution {
    public int countSeniors(String[] details) {

        int count=0;

        for(String data:details){


            char[] agefind=data.toCharArray();
            String digit="";
            for(int i=11;i<13;i++){

               if (Character.isDigit(agefind[i])) {
                digit += agefind[i];
            }

       
            }
            int age=Integer.parseInt(digit);
            if(age > 60){
                count++;
            }
        }
        return count;
        
    }
}