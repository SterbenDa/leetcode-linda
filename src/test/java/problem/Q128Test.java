package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class Q128Test {

    private Q128 sut = new Q128();

    @Test
    public void test_1() {
        // Arrange
        int[] nums = {100, 4, 200, 1, 3, 2};

        // Act
        int result = sut.longestConsecutive(nums);

        // Assert
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test_2() {
        // Arrange
        int[] nums = {100, 4, 200, 1, 3, 2, 2};

        // Act
        int result = sut.longestConsecutive(nums);

        // Assert
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test_3() {
        // Arrange
        int[] nums = {3, 5, 1, 2, 2, 0};

        // Act
        int result = sut.longestConsecutive(nums);

        // Assert
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test_4() {
        // Arrange

        // Act
        int result = sut.longestConsecutive(null);

        // Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test_5() {
        // Arrange
        int[] nums = {};

        // Act
        int result = sut.longestConsecutive(null);

        // Assert
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void test_6() {
        // Arrange
        int[] nums = {0};

        // Act
        int result = sut.longestConsecutive(nums);

        // Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void test_7() {
        // Arrange
        int[] nums = {-7, -1, 3, -9, -4, 7, -3, 2, 4, 9, 4, -9, 8, -7, 5, -1, -7};

        // Act
        int result = sut.longestConsecutive(nums);

        // Assert
        assertThat(result).isEqualTo(4);
    }
}