package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q413Test {

    private Q413 sut = new Q413();

    @Test
    public void test_1() {
        // Arrange
        int[] a = {1, 2, 3, 4};

        // Act
        int result = sut.numberOfArithmeticSlices(a);

        // Assert
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test_2() {
        // Arrange
        int[] a = {1, 2, 3, 8, 9, 10};

        // Act
        int result = sut.numberOfArithmeticSlices(a);

        // Assert
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test_3() {
        // Arrange
        int[] a = {1, 2, 3, 4, 8, 9, 10};

        // Act
        int result = sut.numberOfArithmeticSlices(a);

        // Assert
        assertThat(result).isEqualTo(4);
    }
}