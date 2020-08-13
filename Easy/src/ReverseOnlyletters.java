class Solution {
    public String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack();
        for (char c: S.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        for (char c: S.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }

        return ans.toString();
    }
}


/**
Better than 100%
class Solution {
   public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder(S);
        for (int i = 0, j = S.length() - 1; i < j; ++i, --j) {
            while (i < j && !Character.isLetter(sb.charAt(i))) ++i;
            while (i < j && !Character.isLetter(sb.charAt(j))) --j;
            sb.setCharAt(i, S.charAt(j));
            sb.setCharAt(j, S.charAt(i));
        }
        return sb.toString();
    }
}
**/
