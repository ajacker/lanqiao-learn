package basic;

import java.util.Scanner;

/**
 * BASIC-10 十进制转十六进制
 *
 * @author ajacker
 * @date 2019/12/16 22:32
 */
public class P0010 {
    static String nums = "0123456789ABCDEF";

    public static void main(String[] args) {
        char[] chars = nums.toCharArray();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0){
            System.out.println(0);
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int cur = n % 16;
            sb.append(chars[cur]);
            n /= 16;
        }
        System.out.println(sb.reverse().toString());
    }
}
