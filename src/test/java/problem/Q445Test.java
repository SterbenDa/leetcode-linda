package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import problem.Q445.ListNode;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q445Test {

    private Q445 sut = new Q445();

    @Test
    public void test_1() {
        // Arrange
        ListNode l1 = mockListNode(7, 2, 4, 3);
        ListNode l2 = mockListNode(5, 6, 4);

        // Act
        ListNode result = sut.addTwoNumbers(l1, l2);

        // Assert
        assertThat(toArray(result)).isEqualTo(new Object[]{
                7, 8, 0, 7
        });
    }

    @Test
    public void test_2() {
        // Arrange
        ListNode l1 = mockListNode(9, 9, 9, 9);
        ListNode l2 = mockListNode(1);

        // Act
        ListNode result = sut.addTwoNumbers(l1, l2);

        // Assert
        assertThat(toArray(result)).isEqualTo(new Object[]{
                1, 0, 0, 0, 0
        });
    }

    @Test
    public void test_3() {
        // Arrange
        ListNode l1 = mockListNode(2, 1);
        ListNode l2 = mockListNode(9, 9, 7, 9);

        // Act
        ListNode result = sut.addTwoNumbers(l1, l2);

        // Assert
        assertThat(toArray(result)).isEqualTo(new Object[]{
                1, 0, 0, 0, 0
        });
    }

    @Test
    public void test_4() {
        // Arrange
        ListNode l1 = mockListNode(5);
        ListNode l2 = mockListNode(5);

        // Act
        ListNode result = sut.addTwoNumbers(l1, l2);

        // Assert
        assertThat(toArray(result)).isEqualTo(new Object[]{
                1, 0
        });
    }

    private ListNode mockListNode(int... values) {
        assert values.length > 0;
        ListNode head = new ListNode(values[0]);
        ListNode lastNode = head;
        for (int i = 1; i < values.length; i++) {
            lastNode.next = new ListNode(values[i]);
            lastNode = lastNode.next;
        }
        return head;
    }

    private Object[] toArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.toArray();
    }
}