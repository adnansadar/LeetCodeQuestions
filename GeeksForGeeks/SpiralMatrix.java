/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int mat[][] = new int[M][N];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            spiralmat(mat, M, N);
        }
    }

    public static void spiralmat(int[][] mat, int M, int N) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int beginrow = 0, begincol = 0, endrow = M - 1, endcol = N - 1;
        while (beginrow <= endrow && begincol <= endcol) {
            // left to right
            for (int i = begincol; i <= endcol; i++) {
                list.add(mat[beginrow][i]);
            }
            beginrow++;
            // top to bottom
            for (int i = beginrow; i <= endrow; i++) {
                list.add(mat[i][endcol]);
            }
            endcol--;
            // right to left
            for (int i = endcol; i >= begincol; i--) {
                list.add(mat[endrow][i]);
            }
            endrow--;
            // bottom to top
            for (int i = endrow; i >= beginrow; i--) {
                list.add(mat[i][begincol]);
            }
            begincol++;
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
