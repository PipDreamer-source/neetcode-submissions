class Solution {
    public String decodeString(String s) {

        // Idea here that push when [ is there and use num way where we can get multiple digits and ] in this check string then snum and all 

        Stack<String> stack=new Stack<>();
        int num=0;


        for(Character ch:s.toCharArray()){

            if(Character.isDigit(ch)){

                num=num * 10 + (ch-'0');

            }
            else if(ch == ('[')){

                stack.push(String.valueOf(num));

                // will push [ this also

                 stack.push(String.valueOf(ch));
                 // now for new num new evaulation happens
                 num=0;


            }
            else if(ch == (']'))
            {

                String current="";
                while(!stack.peek().contains("[")){

                current= stack.pop() + current;
                }
                // remove this [ bracket now plan is num ko add krna hai current meabstract


                stack.pop();

                int repeat= Integer.parseInt(stack.pop());
                String expanded="";

                for(int i=0;i< repeat;i++){
                        expanded += current;

                }
                stack.push(expanded);



            }
            else{

                stack.push(String.valueOf(ch));


            }


        }

        String result = "";
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }


return result;





        
    }
}