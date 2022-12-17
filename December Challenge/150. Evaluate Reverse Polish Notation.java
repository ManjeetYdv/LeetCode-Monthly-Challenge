class Solution {
    public int evalRPN(String[] tokens) {
           Stack<Integer> stack = new Stack<>();

        for(String ch : tokens){
            if(ch.equals("+") || ch.equals("-")|| ch.equals("*") || ch.equals("/")){
               int num2 = stack.pop();
               int num1 = stack.pop();
               int res=0;
               if(ch.equals("+")) res =num1+num2;
               if(ch.equals("-")) res =num1-num2;
               if(ch.equals("*")) res =num1*num2;
               if(ch.equals("/")) res = num1/num2;
               stack.push(res);

            }
            else stack.push(Integer.valueOf(ch));
        }

        return stack.pop();
    }
}
