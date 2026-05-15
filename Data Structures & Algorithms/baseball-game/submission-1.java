class Solution {
    public int calPoints(String[] operations) {

            Stack<Integer> stack=new Stack<>();
            int sum=0;

        for(String s:operations){

            if(s.equals("+")){
                int last=stack.pop();
                int secondLast= stack.peek();
                int thereSum=last + secondLast;
                stack.push(last);
                stack.push(thereSum);
                sum += thereSum;



            }
            else if(s.equals("D")){
                int number=2*stack.peek();
                stack.push(number);
                sum+=number;

            }
             else if(s.equals("C")){
                   int number=stack.pop();
                   sum-=number;
                
            }
            else{

                       int num=Integer.parseInt(s);
                      stack.push(num);
                         sum+=num;


            };



        }
        return sum;
        
    }
}