package prev;

import java.util.Arrays;
import java.util.Scanner;

/**
 * PREV-2 打印十字图
 *
 * @author ajacker
 * @date 2019/12/18 1:14
 */
public class P0002 {
    static int[][] dirs = new int[][]{
            {-1, 0},
            {0, -1},
            {1, 0},
            {0, 1},
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = 5 + 4 * n;
        char[][] map = new char[len][len];
        for (int i = 0; i < len; i++) {
            Arrays.fill(map[i], '.');
        }
        int mid = len / 2;
        for (int i = 0; i <= 2; i++) {
            map[mid][mid - i] = '$';
            map[mid][mid + i] = '$';
            map[mid - i][mid] = '$';
            map[mid + i][mid] = '$';
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                map[mid - 2 * i - j][mid - 2 * i] = '$';
                map[mid - 2 * i][mid - 2 * i - j] = '$';
                map[mid + 2 * i + j][mid - 2 * i] = '$';
                map[mid + 2 * i][mid - 2 * i - j] = '$';
                map[mid - 2 * i - j][mid + 2 * i] = '$';
                map[mid - 2 * i][mid + 2 * i + j] = '$';
                map[mid + 2 * i + j][mid + 2 * i] = '$';
                map[mid + 2 * i][mid + 2 * i + j] = '$';
            }
            for (int j = 1; j <= -1 + 4 * i; j++) {
                map[mid - 2 * i - 2][mid - 2 * i + j] = '$';
                map[mid + 2 * i + 2][mid - 2 * i + j] = '$';
                map[mid - 2 * i + j][mid - 2 * i - 2] = '$';
                map[mid - 2 * i + j][mid + 2 * i + 2] = '$';
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
