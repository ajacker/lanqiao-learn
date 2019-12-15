package basic;

import java.util.Scanner;

/**
 * BASIC-3 字母图形
 *
 * @author ajacker
 * @date 2019/12/15 23:44
 */
public class P0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int abs = j > i ? j - i : i - j;
                System.out.print(((char) ('A' + abs)));
            }
            System.out.println();
        }
    }
}
