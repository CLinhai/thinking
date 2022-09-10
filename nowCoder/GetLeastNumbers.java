package nowCoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by lh on 2022/9/10
 * 得到数组中最小的k个数
 */
public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input.length < k || k <1) {
            return list;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer num1, Integer num2) {
                return num2 - num1;
            }
        }
);
        for (int i = 0; i < k; i++) {
            queue.offer(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            if (queue.peek() > input[i]){
                queue.poll();
                queue.offer(input[i]);
            }
        }

        for (int i = 0; i < k; i++){
            list.add(queue.poll());
        }
      return list;
    }

    @Test
    public void testContext(){
        int[] arr  = {3,2,1};
        System.out.println(GetLeastNumbers_Solution(arr, 2));
    }
}
