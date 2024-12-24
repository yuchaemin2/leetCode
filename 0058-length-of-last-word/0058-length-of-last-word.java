class Solution {
    public int lengthOfLastWord(String s) {
        String[] S = s.split("\\s+");
        return S[S.length - 1].length();
    }
}