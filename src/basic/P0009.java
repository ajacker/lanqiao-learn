package basic;

import java.util.Scanner;

/**
 * BASIC-9 特殊回文数
 *
 * @author ajacker
 * @date 2019/12/16 12:00
 */
public class P0009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 10000; i <= 999999; i++) {
            String str = String.valueOf(i);
            char[] chars = str.toCharArray();
            boolean flag = true;
            int sum = 0, p = 0, q = chars.length - 1;
            for (; p < q; p++, q--) {
                if (chars[p]!=chars[q]){
                    flag=false;
                    break;
                }
                sum+=chars[p]-'0';
                sum+=chars[q]-'0';
            }
            if (p==q){
                sum+=chars[p]-'0';
            }
            if (flag&&sum==n){
                System.out.println(i);
            }
        }
    }
}
