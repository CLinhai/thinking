package nowCoder;

/**
 * Created by lh on 2022/9/9
 */
public class CopyRandomList {
    public Node copyRandomList(Node head) {
            if (head == null) return null;
            Node cur = head;
            //1.复制各节点,并构建拼接节点
        while (cur != null) {
            Node tmp = new Node(cur.val);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }

        //构建各新节点的random指向
        cur = head;
        while (cur != null){
            if (cur.random!= null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }

        //拆分两链表
        cur = head.next;
        Node pre = head,res = head.next;
        while (cur.next != null) {
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null;//单独处理原链表尾节点
        return res;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
