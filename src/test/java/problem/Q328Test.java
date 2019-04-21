package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import problem.Q328.ListNode;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q328Test {

    private Q328 sut = new Q328();

    @Test
    public void test_1() {
        // Arrange
        ListNode head = mockListNode(1, 2, 3, 4, 5);

        // Act
        ListNode result = sut.oddEvenList(head);

        // Assert
        assertThat(toArray(result)).isEqualTo(new Object[]{
                1, 3, 5, 2, 4
        });
    }

    private ListNode mockListNode(int... values) {
        assert values.length > 0;
        ListNode head = new ListNode(values[0]);
        ListNode lastNode = head;
        for (int i = 1; i < values.length; i++) {
            ListNode node = new ListNode(values[i]);
            lastNode.next = node;
            lastNode = node;
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