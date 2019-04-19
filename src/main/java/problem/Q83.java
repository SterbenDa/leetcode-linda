package problem;

/**
 * @author linda
 * @create 2019-04-19-17:24
 **/
public class Q83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode lastNode = head;
        ListNode nextNode = head.next;
        while (nextNode != null) {
            if (nextNode.val != lastNode.val) {
                lastNode.next = nextNode;
                lastNode = nextNode;
            }
            nextNode = nextNode.next;
        }
        lastNode.next = null;
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
