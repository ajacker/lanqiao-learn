package basic;


/**
 * BASIC-2 01字串
 * @author ajacker
 * @date 2019/12/15 23:39
 */
public class P0002 {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            String out = String.format("%5s",Integer.toBinaryString(i)).replaceAll(" ", "0");
            System.out.println(out);
        }
    }
}
