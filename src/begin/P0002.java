package begin;

import java.util.Scanner;

/**
 * BEGIN-2 序列求和
 * @author ajacker
 * @date 2019/12/15 22:59
 */
public class P0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println((1L +n)*n/ 2L);
    }
}
