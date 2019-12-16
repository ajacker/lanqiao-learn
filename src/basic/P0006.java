package basic;

import java.util.Scanner;

/**
 * BASIC-6 杨辉三角形
 *
 * @author ajacker
 * @date 2019/12/16 10:16
 */
public class P0006 {
    static int[][] map = new int[35][35];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            map[i][1] = 1;
            map[i][i] = 1;
            for (int j = 2; j < n; j++) {
                map[i][j] = map[i - 1][j] + map[i - 1][j - 1];
            }
        }
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(map[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
