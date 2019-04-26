package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q1027Test {

    private Q1027 sut = new Q1027();

    @Test
    public void test_1() {
        // Arrange
        int[] A = {3, 6, 9, 12};

        // Act
        int result = sut.longestArithSeqLength(A);

        // Assert
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test_2() {
        // Arrange
        int[] A = {9, 4, 7, 2, 10};

        // Act
        int result = sut.longestArithSeqLength(A);

        // Assert
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void test_3() {
        // Arrange
        int[] A = {20, 1, 15, 3, 10, 5, 8};

        // Act
        int result = sut.longestArithSeqLength(A);

        // Assert
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void test_4() {
        // Arrange
        int[] A = {0, 8, 45, 88, 48, 68, 28, 55, 17, 24};

        // Act
        int result = sut.longestArithSeqLength(A);

        // Assert
        assertThat(result).isEqualTo(2);
    }
}