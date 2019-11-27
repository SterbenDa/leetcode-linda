package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q1266Test {

    private Q1266 sut = new Q1266();

    @Test
    public void test_1() {
        // Arrange
        int[][] points = {
                {1, 1},
                {3, 4},
                {-1, 0},
        };

        // Act
        int result = sut.minTimeToVisitAllPoints(points);

        // Assert
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void test_2() {
        // Arrange
        int[][] points = {
                {3, 2},
                {-2, 2},
        };

        // Act
        int result = sut.minTimeToVisitAllPoints(points);

        // Assert
        assertThat(result).isEqualTo(5);
    }
}