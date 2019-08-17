package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q41Test {

    private Q41 sut = new Q41();

    @Test
    public void test_1() {
        // Arrange
        int[] nums = {1, 2, 0};
        // Act
        int result = sut.firstMissingPositive(nums);

        // Assert
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test_2() {
        // Arrange
        int[] nums = {3, 4, -1, 1};

        // Act
        int result = sut.firstMissingPositive(nums);

        // Assert
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test_3() {
        // Arrange
        int[] nums = {7, 8, 9, 11, 12};

        // Act
        int result = sut.firstMissingPositive(nums);

        // Assert
        assertThat(result).isEqualTo(1);
    }
}