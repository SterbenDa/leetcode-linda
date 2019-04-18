package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class Q766Test {

    private Q766 sut = new Q766();

    @Test
    public void test_1() {
        // Arrange
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };

        // Act
        boolean result = sut.isToeplitzMatrix(matrix);

        // Assert
        assertThat(result).isTrue();
    }

    @Test
    public void test_2() {
        // Arrange
        int[][] matrix = {
                {1, 2},
                {2, 2}
        };

        // Act
        boolean result = sut.isToeplitzMatrix(matrix);

        // Assert
        assertThat(result).isFalse();
    }
}