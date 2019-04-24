package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import problem.Q530.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q530Test {

    private Q530 sut = new Q530();

    @Test
    public void test_1() {
        // Arrange
        TreeNode root = new TreeNode(1);
        addTreeNode(root, 3);
        addTreeNode(root, 2);

        // Act
        int result = sut.getMinimumDifference(root);

        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test_2() {
        // Arrange
        TreeNode root = new TreeNode(3);
        addTreeNode(root, 6);
        addTreeNode(root, 5);
        addTreeNode(root, 8);
        addTreeNode(root, 1);
        addTreeNode(root, 2);

        // Act
        int result = sut.getMinimumDifference(root);

        // Assert
        assertThat(result).isEqualTo(1);
    }

    private TreeNode addTreeNode(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }
        if (node.val <= val) {
            node.right = addTreeNode(node.right, val);
        } else {
            node.left = addTreeNode(node.left, val);
        }
        return node;
    }
}