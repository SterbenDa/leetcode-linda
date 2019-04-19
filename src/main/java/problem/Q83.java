package problem;

/**
 * @author linda
 * @create 2019-04-19-17:24
 **/
public class Q83 {

    /**
     * best
     */
    ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
    }

    /**
     * my
     */
    ListNode deleteDuplicates1(ListNode head) {
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
