/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         if (l1 == null || l1.val == 0) {
            return l2;
        }
        if (l2 == null || l2.val == 0) {
            return l1;
        }
        int length1 = findLength(l1);
        int length2 = findLength(l2);
        if (length1 < length2) {
            // l1�
            ListNode tmp = l1;
            l1 = l2;
            l2 = tmp;
        }
        ListNode startL1Node = l1;
        int len = Math.abs(length1 - length2);
        for (int i = 0; i < len; i++) {
            // l1,l2��ͬλ�õ����
            startL1Node = startL1Node.next;
        }

        int add = addParallel(startL1Node, l2);
        if (add <= 0) {
            // l1,l2��Ӧλ����Ӻ�û�н�λ
            return l1;
        }

        if (len == 0) {
            // l1,l2�ȳ�����λ������ԭ�е�l1����
            ListNode newHead = new ListNode(add);
            newHead.next = l1;
            return newHead;
        }

        // l1,l2���ȳ�����Ҫִ��һ��l1ʣ��λ�õļӷ�
        add = addValue(l1, 1, len, add);
        if (add <= 0) {
            return l1;
        }
        // ��λ������ԭ�е�l1����
        ListNode newHead = new ListNode(add);
        newHead.next = l1;
        return newHead;
    }
    
    /**
     * ���ض�λ�ýڵ��ֵ���������յĽ�λ
     */
    private int addValue(ListNode node, int curIndex, int targetIndex, int value) {
        if (curIndex == targetIndex) {
            int addValue = node.val += value;
            node.val = (addValue >= 10) ? addValue - 10 : addValue;
            return (addValue >= 10) ? 1 : 0;
        }
        int addValue = node.val + addValue(node.next, curIndex + 1, targetIndex, value);
        node.val = (addValue >= 10) ? addValue - 10 : addValue;
        return (addValue >= 10) ? 1 : 0;
    }

    /**
     * ��ͬλ�ýڵ���ӣ��������յĽ�λ
     */
    private int addParallel(ListNode l1, ListNode l2) {
        if (l1.next == null && l2.next == null) {
            int addValue = l1.val + l2.val;
            l1.val = (addValue >= 10) ? addValue - 10 : addValue;
            return (addValue >= 10) ? 1 : 0;
        }
        int addValue = l1.val + l2.val + addParallel(l1.next, l2.next);
        l1.val = (addValue >= 10) ? addValue - 10 : addValue;
        return (addValue >= 10) ? 1 : 0;
    }

    private int findLength(ListNode node) {
        if (node == null) {
            return 0;
        }
        return findLength(node.next) + 1;
    }
}