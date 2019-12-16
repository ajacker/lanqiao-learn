package basic;

import java.util.Scanner;

/**
 * BASIC-11 十六进制转十进制
 *
 * @author ajacker
 * @date 2019/12/16 23:04
 */
public class P0011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        long num = 0;
        for (int i = chars.length - 1, n = 0; i >= 0; i--, n++) {
            char c = chars[i];
            int cur = c < 'A' ? c - '0' : 10 + c - 'A';
            num += cur * Math.pow(16, n);
        }
        System.out.println(num);
    }
}
