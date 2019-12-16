package basic;

/**
 * BASIC-8 回文数
 * @author ajacker
 * @date 2019/12/16 10:51
 */
public class P0008 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999 ; i++) {
            StringBuilder str = new StringBuilder().append(i);
            if (str.toString().equals(str.reverse().toString())){
                System.out.println(str.toString());
            }
        }
    }
}
