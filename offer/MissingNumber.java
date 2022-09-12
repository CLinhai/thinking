package offer;

import java.util.HashSet;

/**
 * Created by lh on 2022/9/11
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        HashSet set = new HashSet();
        for(int num : nums){
            set.add(num);
        }
        int length = nums.length - 1;
        for(int i = 0;i <= nums.length - 1;i++){
            if(!set.contains(i))
                return i;
        }
        return 1;
    }
}
