package day01;

/**
 * @Author: clh.
 * @Description: n个数的阶乘,每次运算在前一次基础上乘一个数即可
 * @Date Created in 2022-07-25 19:43
 * @Modified By:
 */
public class demo02 {
    public static long test(int n) {
        int sum = 0;
        int cur = 1;
        for (int i = 1; i <= n; i++) {
            cur *= i;
            sum += cur;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(test(4));
    }
}
