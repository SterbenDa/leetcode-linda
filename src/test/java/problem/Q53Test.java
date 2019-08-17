package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q53Test {

    private Q53 sut = new Q53();

    @Test
    public void test_1() {
        // Arrange
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Act
        int result = sut.maxSubArray(nums);

        // Assert
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void test_2() {
        // Arrange
        int[] nums = {-2};

        // Act
        int result = sut.maxSubArray(nums);

        // Assert
        assertThat(result).isEqualTo(-2);
    }

    @Test
    public void test_3() {
        // Arrange
        int[] nums = {-4, 4};

        // Act
        int result = sut.maxSubArray(nums);

        // Assert
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test_4() {
        // Arrange
        int[] nums = {1, 2};

        // Act
        int result = sut.maxSubArray(nums);

        // Assert
        assertThat(result).isEqualTo(3);
    }
}