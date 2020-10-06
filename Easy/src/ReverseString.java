public class ReverseString {

    public void reverseString(char[] s) {
        int len = s.length - 1;
        for (int i = 0; i < (s.length / 2); i++) {
            char temp = s[len - i];
            s[len - i] = s[i];
            s[i] = temp;
        }
    }
}
