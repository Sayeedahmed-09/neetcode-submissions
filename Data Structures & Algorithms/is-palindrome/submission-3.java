class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }

        s=sb.toString().toLowerCase();
        int right=s.length()-1;
        for(int left=0;left<s.length()/2;left++){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            right--;
        }
        return true;
    }
}
