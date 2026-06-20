class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>res1= new HashMap<>();;
        HashMap<Character,Integer>res2= new HashMap<>();;
        for(int i=0;i<s.length();i++){
            res1.put(s.charAt(i),res1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            res2.put(t.charAt(i),res2.getOrDefault(t.charAt(i),0)+1);
        }
        return res1.equals(res2);

    }
}
