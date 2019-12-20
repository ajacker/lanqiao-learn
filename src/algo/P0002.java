package algo;

import java.util.Scanner;

/**
 * ALGO-2 最大最小公倍数
 *
 * @author ajacker
 * @date 2019/12/20 11:01
 */
public class P0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res;
        if (n<=2){
            res=n;
        } else if (n % 2 == 1) {
            res = n * (n - 1) * (n - 2);
        } else {
            if (n % 3 == 0) {
                res = (n - 1) * (n - 2) * (n - 3);
            } else {
                res = (n - 1) * n * (n - 3);
            }
        }
        System.out.println(res);
    }

}
