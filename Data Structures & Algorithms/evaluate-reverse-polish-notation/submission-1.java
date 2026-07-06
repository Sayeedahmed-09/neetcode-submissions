class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String op:tokens){
            if(op.equals("+")){
                int top=stack.pop();
                int newtop=stack.pop();
                int res=newtop+top;
                stack.push(res);
            }else if(op.equals("-")){
                int top=stack.pop();
                int newtop=stack.pop();
                int res=newtop-top;
                stack.push(res);
            }else if(op.equals("*")){
                int top=stack.pop();
                int newtop=stack.pop();
                int res=newtop*top;
                stack.push(res);
            }else if(op.equals("/")){
                int top=stack.pop();
                int newtop=stack.pop();
                int res=newtop/top;
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        return stack.peek();
    }
}
