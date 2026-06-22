class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> groupAnagram=new HashMap<>();

        for(String str:strs){
            char charArray[]=str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr=String.valueOf(charArray);
            if(!groupAnagram.containsKey(sortedStr)){
                groupAnagram.put(sortedStr,new ArrayList<>());
            }
            groupAnagram.get(sortedStr).add(str);
        }
        return new ArrayList<>(groupAnagram.values());
    }
}
