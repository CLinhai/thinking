package nowCoder;

/**
 * Created by lh on 2022/9/8
 * 合并两个递增的链表
 *
 */
public class MergeList {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode dum = new ListNode(0);//虚拟头节点
        ListNode cur = dum;//指向要增加节点的节点
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2;
        return dum.next;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
