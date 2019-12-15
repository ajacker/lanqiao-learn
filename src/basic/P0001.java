package basic;

import java.util.Scanner;

/**
 * BASIC-1 闰年判断
 *
 * @author ajacker
 * @date 2019/12/15 23:34
 */
public class P0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.print(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "yes" : "no");
    }
}
