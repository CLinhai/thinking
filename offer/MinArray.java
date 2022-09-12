package offer;

import org.junit.Test;

/**
 * Created by lh on 2022/9/12
 */
public class MinArray {
    public int minArray(int[] numbers) {
        if (numbers.length == 1) return numbers[0];
        for (int i = 0; i < numbers.length - 1; ) {
            if (numbers[i + 1] >= numbers[i])
                i++;
            else if (numbers[i + 1] < numbers[i])
                return numbers[i];
            else
                return numbers[0];
        }
        return 0;
    }

    @Test
    public void test() {

    }
}
