class Solution {
    public String simplifyPath(String path) {

        // Always remember that when split by / it creates tokens and // goes away


        Stack<String> stack=new Stack<>();

        String[] split=path.split("/");

        for(String part:split){


            if(part.equals("") || part.equals(".")){
                continue;
            }
            else if(part.equals("..")){
                if(!stack.isEmpty()){
                    // remove that part a,b,c,..dabstrac level up it 
                    stack.pop();
                }

            }else{
                stack.push(part);
            }






        }

        StringBuilder result=new StringBuilder();

        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" :result.toString();

        




        
    }
}