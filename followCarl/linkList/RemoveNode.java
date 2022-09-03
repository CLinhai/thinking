package followCarl.linkList;

//移除链表元素
public class RemoveNode {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        //设置虚拟头节点
        ListNode dummy = new ListNode(-1, head);
        ListNode pre =  dummy;
        ListNode cur = head;
        while (cur != null){
            if (cur.val == val){
                pre.next = cur.next;
            }else{
                pre = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    public ListNode removeElementsTo(ListNode head, int val) {
        return null;
    }
}

