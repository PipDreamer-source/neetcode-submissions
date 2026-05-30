class Solution {
    public boolean isValid(String s) {

        // Simple logic use first insert  normal signs and afte rthat check by peeking if its there or not 


        Stack<Character> stack=new Stack<>();




        for(char ch:s.toCharArray()){

            if(ch == '(' || ch =='{' || ch == '['){
                stack.push(ch);
            }
            else{

                           if(stack.isEmpty()){
                            return false;
                           }


                           char check=stack.peek();

                           if((ch == ')' && check == '(' ) || (ch == '}' && check == '{') ||  (ch == ']' && check =='['))
                           {

                            stack.pop();

                           }
                           else{
                            return false;
                           }
                       
            }
            





        }
        return stack.isEmpty();
        
    }
}
