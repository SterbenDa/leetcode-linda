package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q11Test {

    private Q11 sut = new Q11();

    @Test
    public void test_1() {
        // Arrange
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        // Act
        int result = sut.maxArea(height);

        // Assert
        assertThat(result).isEqualTo(49);
    }
}