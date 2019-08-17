package problem;

/**
 * 解题思路： O(N) time
 * 选出长的作为l1，让l1,l2对应位置相加，求出进位后在l1上对应位置执行加法
 *
 * @author linda
 * @create 2019-04-25-17:50
 **/
class Q445 {

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l1.val == 0) {
            return l2;
        }
        if (l2 == null || l2.val == 0) {
            return l1;
        }
        int length1 = findLength(l1);
        int length2 = findLength(l2);
        if (length1 < length2) {
            // l1最长
            ListNode tmp = l1;
            l1 = l2;
            l2 = tmp;
        }
        ListNode startL1Node = l1;
        int len = Math.abs(length1 - length2);
        for (int i = 0; i < len; i++) {
            // l1,l2相同位置的起点
            startL1Node = startL1Node.next;
        }

        int add = addParallel(startL1Node, l2);
        if (add <= 0) {
            // l1,l2对应位置相加后没有进位
            return l1;
        }

        if (len == 0) {
            // l1,l2等长，进位超出了原有的l1长度
            ListNode newHead = new ListNode(add);
            newHead.next = l1;
            return newHead;
        }

        // l1,l2不等长，还要执行一次l1剩余位置的加法
        add = addValue(l1, 1, len, add);
        if (add <= 0) {
            return l1;
        }
        // 进位超出了原有的l1长度
        ListNode newHead = new ListNode(add);
        newHead.next = l1;
        return newHead;
    }

    /**
     * 在特定位置节点加值，返回最终的进位
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
     * 相同位置节点相加，返回最终的进位
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

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
