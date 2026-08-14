class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return isPalindrome(s,left+1,right) | isPalindrome(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome(String input,int si,int ei){
        while(si<ei){
            if(input.charAt(si)!=input.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
}