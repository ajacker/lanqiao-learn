package prev;

import java.util.Scanner;

/**
 * PREV-1 核桃的数量
 *
 * @author ajacker
 * @date 2019/12/17 10:04
 */
public class P0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i = a; i <= Integer.MAX_VALUE; i += a) {
            if (i % b == 0 && i % c == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
