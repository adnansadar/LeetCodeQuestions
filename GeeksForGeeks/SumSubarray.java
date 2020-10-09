
import java.util.*;

class SumSubarray {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = sc.nextInt();
		int sum = sc.nextInt();
		int[] A = new int[N];
		int newsum=0;
		int ptr=0;
		while(T>0)
		{
    		for(int i=0; i<N; i++)
    		{
    		    A[i] = sc.nextInt();
    		}
    		
    		for(int i=0; i<A.length;i++)
    		{
    		    newsum+= A[i];
    		    if(newsum == sum)
    		    System.out.println((ptr+1)+" "+(i+1));
    		    else if(newsum>sum)
    		    {
    		        newsum -= ptr;
    		        ptr++;
    		    }
    		}
    		T--;
		}
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            findSubArray(n, s, m);
        }
    }

    private static void findSubArray(int n, int s, int[] m) {
        int first = 0;
        int last = 0;

        long result = m[first];

        while (result != s) {
            if (result > s) {
                if (first == last) {
                    last++;
                    first++;
                    if (last >= n)
                        break;
                    result = m[first];
                } else {
                    result -= m[first];
                    first++;
                }
            } else {
                last++;
                if (last < n) {
                    result += m[last];
                } else {
                    break;
                }
            }
        }

        if (result != s) {
            System.out.println(-1);
        } else {
            System.out.println((first + 1) + " " + (last + 1));
        }
    }
}
