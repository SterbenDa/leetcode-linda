package problem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class Q516Test {

    private Q516 sut = new Q516();

    @Test
    public void test_1() {
        // Arrange
        String s = "bbbab";

        // Act
        int result = sut.longestPalindromeSubseq(s);

        // Assert
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void test_2() {
        // Arrange
        String s = "cbbd";

        // Act
        int result = sut.longestPalindromeSubseq(s);

        // Assert
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void test_3() {
        // Arrange
        String s = "aabaa";

        // Act
        int result = sut.longestPalindromeSubseq(s);

        // Assert
        assertThat(result).isEqualTo(5);
    }
}