package twosearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class search {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6};
//        System.out.println(Solution.search(nums, 3));
        int[] nums = {1, 1, 2};

    }
}

//二分查找
class Solution {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }


    //链表反转
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        while (listNode != null) {
            s.push(listNode.val);
            listNode = listNode.next;
        }
        while (!s.isEmpty()) {
            res.add(s.pop());
        }
        return res;
    }

    //链表反转放回新链表表头
    public ListNode ReverseList(ListNode head) {
        Stack<ListNode> s = new Stack<>();
        while (head != null) {
            s.push(head);
            head = head.next;
        }
        if (s.isEmpty())
            return null;
        ListNode node = s.pop();
        while (!s.isEmpty()) {
            ListNode tempNode = s.pop();
            node.next = tempNode;
            node = tempNode;
        }
        node.next = null;
        return node;
    }

    public static int removeDuplicates(int[] nums) {
        int size = nums.length;
        if (size < 2) {
            return 1;
        }
        int slow = 1;
        for (int fast = 1; fast < size; fast++) {
            if (nums[fast] != nums[fast - 1])
                nums[slow++] = nums[fast];
        }
        return slow;
    }

    public static void moveZeroes(int[] nums) {
        int slow = 0;//慢指针指向要更新的下标
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i >= slow) {
                nums[i] = 0;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    //判断两个字符串是否相等
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder ssb = new StringBuilder();
        StringBuilder tsb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                ssb.append(c);
            } else if (ssb.length() != 0) {
                ssb.deleteCharAt(ssb.length() - 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (c != '#') {
                tsb.append(c);
            } else if (ssb.length() != 0) {
                tsb.deleteCharAt(ssb.length() - 1);
            }
        }
        return ssb.toString().equals(tsb.toString());
    }


    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 5, 0, 6};
//        removeDuplicates(nums);
        moveZeroes(nums);
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}



