package basic;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * BASIC-13 数列排序
 * @author ajacker
 * @date 2019/12/17 0:30
 */
public class P0013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        Arrays.stream(nums).sorted().forEach(i-> System.out.print(i+" "));
    }
}
