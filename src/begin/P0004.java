package begin;

import java.util.Scanner;

/**
 * BEGIN-4 Fibonacci数列
 *
 * @author ajacker
 * @date 2019/12/15 23:19
 */
public class P0004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        if (n <= 1) {
            res = n;
        } else {
            int ret1 = 0;
            int ret2 = 1;
            int i = 2;
            while (i <= n) {
                res = (ret1 + ret2) % 10007;
                ret1 = ret2;
                ret2 = res;
                i++;
            }
        }
        System.out.println(res);
    }

}
