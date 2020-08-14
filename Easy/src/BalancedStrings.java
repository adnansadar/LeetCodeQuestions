//Balanced strings are those who have equal quantity of 'L' and 'R' characters.

//Given a balanced string s split it in the maximum amount of balanced strings.

//Return the maximum amount of splitted balanced strings.
class Solution {
    public int balancedStringSplit(String s) {
            int count=0,result=0;
        for(int i = 0;i<s.length();i++)
        {
            count += s.charAt(i) == 'L' ? 1 : -1;
            result += count == 0 ? 1 : 0;
        }
        return result;
    }
}
