package nowCoder;

import java.util.Stack;

/**
 * Created by lh on 2022/9/9
 */
public class ReverseList {
    public class Solution {
        public ListNode ReverseList(ListNode head) {
            if (head == null)
                return null;
            ListNode pre = null;
            ListNode next = null;
            while (head != null) {
                next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;
        }
    }

    public int[] reversePrint(ListNode head) {
        if(head == null)
            return null;
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        return arr;

    }
}
