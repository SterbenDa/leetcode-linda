package problem;

/**
 * @author linda
 * @create 2019-04-21-22:10
 **/
class Q328 {

    ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    /**
     * my
     */
    ListNode oddEvenList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int i = 3;
        ListNode lastOddNode = head;

        ListNode starEvenNode = head.next;
        ListNode lastEvenNode = head.next;

        ListNode node = head.next.next;
        while (node != null) {
            if ((i & 1) == 1) {
                lastOddNode.next = node;
                lastOddNode = node;
            } else {
                lastEvenNode.next = node;
                lastEvenNode = node;
            }
            node = node.next;
            i++;
        }
        // 尾巴记得置空
        lastEvenNode.next = null;
        lastOddNode.next = starEvenNode;
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
