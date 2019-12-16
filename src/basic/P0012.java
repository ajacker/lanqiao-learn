package basic;

import java.util.Scanner;

/**
 * BASIC-12 十六进制转八进制
 *
 * @author ajacker
 * @date 2019/12/16 23:34
 */
public class P0012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            StringBuilder binaryBuilder = new StringBuilder();
            String str = sc.next();
            char[] chars = str.toCharArray();
            //16转2进制
            for (int j = 0; j < chars.length; j++) {
                char c = chars[j];
                int cur = c < 'A' ? c - '0' : 10 + c - 'A';
                binaryBuilder.append(cur >>> 3 & 1);
                binaryBuilder.append(cur >>> 2 & 1);
                binaryBuilder.append(cur >>> 1 & 1);
                binaryBuilder.append(cur & 1);
            }
            int len = binaryBuilder.length();
            //长度如果不为3的倍数补前导0
            if (len % 3 != 0) {
                int addCount = 3 - len % 3;
                for (int j = 0; j < addCount; j++) {
                    binaryBuilder.insert(0, 0);
                }
                len += addCount;
            }
            //2转8
            chars = binaryBuilder.toString().toCharArray();
            StringBuilder resBuilder = new StringBuilder();
            boolean flag = false;
            for (int j = 0; j < len; j += 3) {
                int num = 0;
                num |= (chars[j] - '0') << 2;
                num |= (chars[j+1] - '0') << 1;
                num |= (chars[j+2] - '0');
                if (num!=0){
                    flag=true;
                }
                if (flag){
                    resBuilder.append(num);
                }
            }

            System.out.println(resBuilder.toString());
        }
    }


}
