package nowCoder;

import org.junit.Test;

/**
 * Created by lh on 2022/9/9
 * 青蛙跳台阶
 */
public class jumpSwap {
    public int jumpFloor(int target) {
        if(target <= 0)
            return 0;
           else if (target == 1)
            return 1;
            else if (target == 2)
            return 2;
        else
        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }

    @Test
    public void init(){
        System.out.println(jumpFloor(5));
    }
}
