class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int top;
        int newtop;
        int res;
        for(String op:tokens){
            if(op.equals("+")){
                top=stack.pop();
                newtop=stack.pop();
                res=newtop+top;
                stack.push(res);
            }else if(op.equals("-")){
                top=stack.pop();
                newtop=stack.pop();
                res=newtop-top;
                stack.push(res);
            }else if(op.equals("*")){
                top=stack.pop();
                newtop=stack.pop();
                res=newtop*top;
                stack.push(res);
            }else if(op.equals("/")){
                top=stack.pop();
                newtop=stack.pop();
                res=newtop/top;
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        return stack.peek();
    }
}
