class Solution {
    public String reverseWords(String s) {
        
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0 ;i<s.length() ;i++){
            if(s.charAt(i)!=' ') sb.append(s.charAt(i));

            if(s.charAt(i)==' ' || i==s.length()-1){
                if(sb.length()>0) {
                    stack.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()) res.append(stack.pop()+" ");
        return res.deleteCharAt(res.length()-1).toString(); //removed the last "" 
    }
}
