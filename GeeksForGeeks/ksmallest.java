
import java.util.*;
import java.lang.*;
import java.io.*;
public class ksmallest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] m = new int[n];
            for (int i = 0; i < n; i++) {
                m[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            Arrays.sort(m);
            System.out.println(m[k - 1]);
        }
    }
}
