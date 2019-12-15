package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * BASIC-5 查找整数
 *
 * @author ajacker
 * @date 2019/12/16 0:32
 */
public class P0005 {
    static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static short[] pos = new short[10005];

    public static void main(String[] args) throws IOException {
        in.nextToken();
        int n = (int) in.nval;
        for (short i = 1; i <= n; i++) {
            in.nextToken();
            int num = (int) in.nval;
            if (pos[num] == 0) {
                pos[num] = i;
            }
        }
        in.nextToken();
        int f = (int) in.nval;
        System.out.print(pos[f] == 0 ? -1 : pos[f]);
    }
}
