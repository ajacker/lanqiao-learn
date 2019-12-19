package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * ALGO-1 区间k大数查询
 *
 * @author ajacker
 * @date 2019/12/19 12:38
 */
public class P0001 {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) throws IOException {
        in.nextToken();
        int n = (int) in.nval;
        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            in.nextToken();
            nums[i] = (int) in.nval;
        }
        in.nextToken();
        int m = (int) in.nval;
        for (int i = 0; i < m; i++) {
            in.nextToken();
            int l = (int) in.nval;
            in.nextToken();
            int r = (int) in.nval;
            in.nextToken();
            int K = (int) in.nval;
            int len = r - l + 1;
            int[] temp = new int[len];
            for (int j = l; j <= r; j++) {
                temp[j - l] = nums[j];
            }
            Arrays.sort(temp);
            System.out.println(temp[len - K]);
        }
    }
}
