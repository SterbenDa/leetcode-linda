/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
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
        // Œ≤∞Õº«µ√÷√ø’
        lastEvenNode.next = null;
        lastOddNode.next = starEvenNode;
        return head;
    }
}