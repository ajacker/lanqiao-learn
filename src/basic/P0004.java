package basic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * BASIC-4 数列特征
 *
 * @author ajacker
 * @date 2019/12/16 0:25
 */
public class P0004 {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) throws IOException {
        in.nextToken();
        int n = (int) in.nval;
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            in.nextToken();
            int num = (int) in.nval;
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }
        System.out.printf("%d\n%d\n%d", max, min, sum);
    }
}
