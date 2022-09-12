package offer;

import org.junit.Test;

/**
 * Created by lh on 2022/9/12
 */
public class NumWays {
    public int numWays(int n) {
        if (n < 0) {
            return 0;
        }else {
            if(n == 1) return 1;
            if(n == 2) return 2;
            if(n > 2) return numWays(n - 1) + numWays(n - 2);
        }
        return 0;
    }

    @Test
    public void test(){
        System.out.println(numWays(7));
    }
}
