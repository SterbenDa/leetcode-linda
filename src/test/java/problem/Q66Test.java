package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q66Test {

    private Q66 sut = new Q66();

    @Test
    public void test_1() {
        // Arrange
        int[] digits = {1, 2, 3};

        // Act
        int[] result = sut.plusOne(digits);

        // Assert
        assertThat(result).isEqualTo(new int[]{
                1, 2, 4
        });
    }

    @Test
    public void test_2() {
        // Arrange
        int[] digits = {9, 9, 9};

        // Act
        int[] result = sut.plusOne(digits);

        // Assert
        assertThat(result).isEqualTo(new int[]{
                1, 0, 0, 0
        });
    }
}