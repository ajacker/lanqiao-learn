package begin;

import java.util.Scanner;

/**
 * BEGIN-3 圆的面积
 *
 * @author ajacker
 * @date 2019/12/15 23:16
 */
public class P0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.printf("%.7f",  Math.PI * r * r);
    }
}
