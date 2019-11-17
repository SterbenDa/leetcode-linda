package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q64Test {

    private Q64 sut = new Q64();

    @Test
    public void test_1() {
        // Arrange
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}};

        // Act
        int result = sut.minPathSum(grid);

        // Assert
        assertThat(result).isEqualTo(7);
    }
}