package day01;

/**
 * @Author: clh.
 * @Description: 二进制表示数字
 * @Date Created in 2022-07-25 19:17
 * @Modified By:
 */
public class demo01 {
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(1);
    }
}
