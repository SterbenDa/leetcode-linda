package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q1252Test {

    private Q1252 sut = new Q1252();

    @Test
    public void test_1() {
        // Arrange
        int[][] indices = {
                {0, 1},
                {1, 1}
        };

        // Act
        int result = sut.oddCells(2, 3, indices);

        // Assert
        assertThat(result).isEqualTo(6);
    }
}